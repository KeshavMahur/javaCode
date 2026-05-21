package com.lcwd.user.service.UserService.utilityService;

import com.lcwd.user.service.UserService.dto.UserDTO;
import com.lcwd.user.service.UserService.entites.User;
public interface UserUtilsService {
    static User convertUserDtoToUser(User user, UserDTO userDTO){
        user.setUserId(userDTO.getUserId());
        user.setName(userDTO.getName());
        user.setEmailId(userDTO.getEmailId());
        user.setAbout(userDTO.getAbout());
        return user;
    }

    static UserDTO convertUserToUserDTO(UserDTO userDTO,User user){
        userDTO.setUserId(user.getUserId());
        userDTO.setName(user.getName());
        userDTO.setEmailId(user.getEmailId());
        userDTO.setAbout(user.getAbout());
        return userDTO;
    }
}
