package com.rating.service.ratingService.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
@Getter
@Setter
@Document("rating_service")
public class Rating {
    @Id
    public String id;

    @Field(name = "desc")
    private String description;

    @CreatedDate
    private Date added;

    @Field(name = "usrId")
    private String userId;

    @Field(name = "htlId")
    private String hotelId;
}
