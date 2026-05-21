package com.lcwd.user.service.UserService.services;

import com.lcwd.user.service.UserService.dto.UserDTO;
import com.lcwd.user.service.UserService.entites.User;

import java.util.List;

public interface UserServices {
    UserDTO createNewUser(UserDTO userDTO);
    List<UserDTO> getAllUser();
    UserDTO findUserById(String id);
    void deleteById(String id);
}
