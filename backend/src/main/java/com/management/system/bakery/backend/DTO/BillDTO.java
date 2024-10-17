package com.management.system.bakery.backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class BillDTO {
    private Long billId;
    private UserDTO user;
    private OrderDTO order; // Associated order
    private TableReservationStatusDTO table;
    private Double billAmount;
    private Timestamp billDate;
    private String billStatus; // e.g., Paid, Unpaid
}
