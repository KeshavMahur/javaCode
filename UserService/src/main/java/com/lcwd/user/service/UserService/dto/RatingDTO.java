package com.lcwd.user.service.UserService.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
@Setter
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RatingDTO {
    public String id;
    private String description;
    private Date added;
    private String userId;
    private String hotelId;
    private HotelDTO hotelDTO;
}
