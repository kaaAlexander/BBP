package by.tut.kaa.alexander.bbp.user.service;

import by.tut.kaa.alexander.bbp.user.service.modelDTO.UserDTO;

import java.util.List;

public interface UserService {

    public Long save(UserDTO userDTO);
    public UserDTO getUserById(Long id);
    public List<UserDTO> getAllUsers();
}
