package com.hotel.service.HotelService.reponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ApiResponse<T> {
    private HttpStatus status = HttpStatus.OK;
    private int code = HttpStatus.OK.value();
    private T data;

    public ApiResponse() {
        super();
    }

    public ApiResponse(T data) {
        super();
        this.data = data;
    }
}
