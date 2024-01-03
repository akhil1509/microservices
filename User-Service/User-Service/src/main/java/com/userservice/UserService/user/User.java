package com.userservice.UserService.user;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "userservice")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String name;
    private String email;
    private String about;


}
