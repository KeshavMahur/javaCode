package com.lcwd.user.service.UserService.customException;

public class UserNotFoundException extends ApiException {
    public static final long serialVersionUID = 1L;

    public UserNotFoundException(String message){
        super(message);
    }

}
