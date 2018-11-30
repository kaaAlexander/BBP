package by.tut.kaa.alexander.bbp.user.controller;

import by.tut.kaa.alexander.bbp.user.service.UserService;
import by.tut.kaa.alexander.bbp.user.service.modelDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public Long saveUser(UserDTO userDTO) {
        return userService.save(userDTO);
    }

    @GetMapping(path = "/{id}")
    public UserDTO getUserById(Long id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }
}
