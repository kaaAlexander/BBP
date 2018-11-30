package by.tut.kaa.alexander.bbp.user.service.serviceImpl;

import by.tut.kaa.alexander.bbp.account.service.AccountService;
import by.tut.kaa.alexander.bbp.document.service.DocumentService;
import by.tut.kaa.alexander.bbp.user.repository.model.User;
import by.tut.kaa.alexander.bbp.user.repository.UserRepository;
import by.tut.kaa.alexander.bbp.user.service.UserService;
import by.tut.kaa.alexander.bbp.user.service.modelDTO.UserDTO;
import by.tut.kaa.alexander.bbp.user.service.util.UserConverter;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class userServiceImpl implements UserService {

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    AccountService accountService;

    @Autowired
    DocumentService documentService;

    @Override
    public Long save(UserDTO userDTO) {
        User user = new User();
        String password = RandomString.make(25);
        if (sendEmail(userDTO.getEmail(), password)) {
            userDTO.setPassword(password);
            userDTO.setRole("USER");
            user = userConverter.convert(userDTO);
            userRepository.save(user);
        }
        Long id = user.getUserId();
        return id;
    }

    @Override
    public UserDTO getUserById(Long id) {
        User user = userRepository.findOneByUserId(id);
        UserDTO userDTO = userConverter.convert(user);
        return userDTO;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> userList = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user : userList) {
            UserDTO userDTO = userConverter.convert(user);
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    private boolean sendEmail(String email, String password) {
        boolean status = true;
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.yandex.ru");
        mailSender.setPort(465);
        mailSender.setUsername("bbp.info@yandex.ru");
        mailSender.setPassword("bbp.info.password");
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");
        props.put("mail.smtp.ssl.enable", "true");
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message);
            message.setFrom("bbp.info@yandex.ru");
            helper.setTo(email);
            helper.setSubject("Регистрация в Blockchain Bank Platform");
            helper.setText("Спасибо за регистрацию в Blockchain Bank platform!" + "\n" + "Ваш пароль для входа : " + password);
            mailSender.send(message);
        } catch (Exception e) {
            status = false;
        }
        return status;
    }
}
