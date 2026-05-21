package com.lcwd.user.service.UserService.responce;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ToString
public class ApiResponse<T> {

    private HttpStatus status = HttpStatus.OK;
    private int code = HttpStatus.OK.value();
    private String message;
    private T data;
    private Exception exception;


    public ApiResponse() {
        super();
    }

    public ApiResponse(T data) {
        super();
        this.data = data;
    }

    public ApiResponse(HttpStatus httpStatus, String message) {
        super();
        this.status = httpStatus;
        this.code = httpStatus.value();
        this.message = message;
    }
}
