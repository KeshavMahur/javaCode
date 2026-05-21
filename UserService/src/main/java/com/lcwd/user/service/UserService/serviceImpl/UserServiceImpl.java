package com.lcwd.user.service.UserService.serviceImpl;

import com.lcwd.user.service.UserService.dto.UserDTO;
import com.lcwd.user.service.UserService.entites.User;
import com.lcwd.user.service.UserService.repositories.UserRepository;
import com.lcwd.user.service.UserService.services.UserServices;
import com.lcwd.user.service.UserService.utilityService.UserUtilsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServices {

    private final UserRepository userRepository;

    @Override
    public UserDTO createNewUser(UserDTO userDTO) {
        User user = UserUtilsService.convertUserDtoToUser(new User(),userDTO);
        return UserUtilsService.convertUserToUserDTO(userDTO,userRepository.save(user));
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<UserDTO> users = userRepository.findAll().stream().map(user -> UserUtilsService.convertUserToUserDTO(new UserDTO(),user)).collect(Collectors.toList());
        return users;
    }

    @Override
    public UserDTO findUserById(String id) {
        return UserUtilsService.convertUserToUserDTO(new UserDTO(),userRepository.findById(id).orElse(new User()));
    }

    @Override
    public void deleteById(String id) {
       userRepository.deleteById(id);
    }
}
