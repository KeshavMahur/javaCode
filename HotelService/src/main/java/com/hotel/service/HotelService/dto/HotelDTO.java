package com.hotel.service.HotelService.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HotelDTO {

    @NotBlank(message = "Id can't blank")
    private String id;

    @NotBlank(message = "Name can't blank")
    private String name;

    @NotBlank(message = "Address can't blank")
    private String address;

    private String about;
}
