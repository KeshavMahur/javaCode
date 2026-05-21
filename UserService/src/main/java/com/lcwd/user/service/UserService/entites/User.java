package com.lcwd.user.service.UserService.entites;

import com.lcwd.user.service.UserService.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

@Table(name = "micro_users")
@Entity
@Getter
@Setter
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String userId;

    @Column(name = "NAME", length = 25)
    private String name;

    @Column(name = "EMAIL")
    private String emailId;

    @Column(name = "ABOUT")
    private String about;


}
