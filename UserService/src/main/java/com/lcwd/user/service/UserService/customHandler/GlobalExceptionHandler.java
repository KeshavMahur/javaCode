package com.lcwd.user.service.UserService.customHandler;

import com.lcwd.user.service.UserService.customException.ApiException;
import com.lcwd.user.service.UserService.customException.UserNotFoundException;
import com.lcwd.user.service.UserService.responce.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ApiResponse<?> handleUserNotFoundException(ApiException apiException){
        return new ApiResponse<>(HttpStatus.NOT_ACCEPTABLE,apiException.getMessage());
    }
}
