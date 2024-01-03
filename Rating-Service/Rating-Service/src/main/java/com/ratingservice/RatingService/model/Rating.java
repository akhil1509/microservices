package com.ratingservice.RatingService.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "ratingservice")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private Long HotelId;
    private Long UserId;
    private int rating;
    private  String feedback;
}
