package com.rating.service.ratingService.dtos;

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
    @NotEmpty(message = "Description can't blank")
    private String description;
    private Date added;

    @NotBlank(message = "Please provide user id")
    private String userId;

    @NotBlank(message = "Please provide hotel id")
    private String hotelId;
}
