package com.lcwd.user.service.UserService.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lcwd.user.service.UserService.entites.Rating;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserDTO {

    private String userId;

    @NotBlank(message = "User Id can't blank")
    private String name;

    private String emailId;

    private String about;

    private List<RatingDTO> ratingList;
}
