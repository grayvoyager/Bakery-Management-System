package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.Bill;

import java.time.LocalDateTime;
import java.util.List;

public interface BillService {
    Bill createBill(Bill bill);
    Bill updateBill(Long billId, Bill bill);
    Bill findById(Long billId);
    Bill findByName(String name);
    List<Bill> getBillsByUserId(Long userId);
    List<Bill> getBillsByTableId(Long tableId);
    List<Bill> getBillsByStatus(String status);
    Bill markBillAsPaid(Long userId);
    void deleteBill(Long billId);


    //    // Get all bills within a specific date range
//    List<Bill> getBillsByDateRange(LocalDateTime startDate, LocalDateTime endDate);Bill markBillAsPaid(Long billId);


}
