package by.tut.kaa.alexander.bbp.user.service.util;

import by.tut.kaa.alexander.bbp.account.service.util.AccountConverter;
import by.tut.kaa.alexander.bbp.document.service.util.DocumentConverter;
import by.tut.kaa.alexander.bbp.user.repository.model.User;
import by.tut.kaa.alexander.bbp.user.service.modelDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    @Autowired
    private DocumentConverter documentConverter;

    @Autowired
    private AccountConverter accountConverter;

    public User convert(UserDTO userDTO) {
        User user = new User();
        user.setUserId(userDTO.getUserId());
        user.setAddress(userDTO.getAddress());
        user.setBankInfo(userDTO.getBankInfo());
        user.setBic(userDTO.getBic());
        user.setEmail(userDTO.getEmail());
        user.setIndividual(userDTO.isIndividual());
        user.setInfo(userDTO.getInfo());
        user.setPassword(userDTO.getPassword());
        user.setPhone(userDTO.getPhone());
        user.setName(userDTO.getName());
        user.setUnp(userDTO.getUnp());
        user.setRole(userDTO.getRole());
        user.setCommission(userDTO.getCommission());
        return user;
    }

    public UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setName(user.getName());
        userDTO.setAddress(user.getAddress());
        userDTO.setPassword(user.getPassword());
        userDTO.setPhone(user.getPhone());
        userDTO.setBankInfo(user.getBankInfo());
        userDTO.setBic(user.getBic());
        userDTO.setEmail(user.getEmail());
        userDTO.setInfo(user.getInfo());
        userDTO.setIndividual(user.isIndividual());
        userDTO.setUnp(user.getUnp());
        userDTO.setRole(user.getRole());
        userDTO.setCommission(user.getCommission());
        return userDTO;
    }
}
