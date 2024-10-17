package com.management.system.bakery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;

@Data
@Entity
@NoArgsConstructor
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "food_item_id", nullable = false)
    private FoodItem foodItem;

    @Column(name = "rating", nullable = false) // Assuming rating is between 1 to 5
    private Integer rating;

    @Column(name = "comment")
    private String comment;

    @Column(name = "review_date", nullable = false)
    private Timestamp reviewDate;
}
