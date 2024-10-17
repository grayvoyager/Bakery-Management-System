package com.management.system.bakery.backend.DTO;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class ReviewDTO {
    private Long reviewId;
    private UserDTO user;
    private FoodItemDTO foodItem;
    private Integer rating; // 1 to 5
    private String comment;
    private Timestamp reviewDate;
}

