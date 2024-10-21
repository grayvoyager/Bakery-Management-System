package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.Bill;
import com.management.system.bakery.backend.exceptions.EntityNotFoundException;
import com.management.system.bakery.backend.respository.BillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BillServiceImpl implements BillService{
    private BillRepository billRepository;
    @Override
    public Bill createBill(Bill bill) {
        if (bill.getBillAmount() == null) {
            bill.setBillAmount(calculateBillAmount(bill));
        }
        return billRepository.save(bill);
    }
    private Double calculateBillAmount(Bill bill) {
        return bill.getOrder().getOrderAmount();
    }

    @Override
    public Bill updateBill(Long billId, Bill updatedBill) {
        Bill existingBill = billRepository.findById(billId)
                .orElseThrow(() -> new EntityNotFoundException("Bill not found with ID: " + billId));

        existingBill.setUser(updatedBill.getUser());
        existingBill.setOrder(updatedBill.getOrder());
        existingBill.setTable(updatedBill.getTable());
        existingBill.setBillAmount(updatedBill.getBillAmount());
        existingBill.setBillStatus(updatedBill.getBillStatus());
        existingBill.setBillDate(updatedBill.getBillDate());

        return billRepository.save(existingBill);
    }

    @Override
    public Bill findById(Long billId) {
        return billRepository.findById(billId)
                .orElseThrow(()->new EntityNotFoundException("No such bill exists"));
    }

    @Override
    public Bill findByName(String userName) {
        return billRepository.findByName(userName).orElseThrow(()->new EntityNotFoundException(""));
    }

    @Override
    public List<Bill> getBillsByUserId(Long userId) {
        return billRepository.findByUserId(userId)
                .orElseThrow(()->new EntityNotFoundException("Doesn't exist"));
    }

    @Override
    public List<Bill> getBillsByTableId(Long tableId) {
        return billRepository.findByTableId(tableId)
                .orElseThrow(()->new EntityNotFoundException("Doesn't exist"));
    }

    @Override
    public List<Bill> getBillsByStatus(String status) {
        return billRepository.findByBillStatus(status)
                .orElseThrow(()->new EntityNotFoundException("No such bill exists."));
    }

    @Override
    public Bill markBillAsPaid(Long userId) {
        Bill bill = (Bill) billRepository.findByUserId(userId)
                .orElseThrow(() -> new EntityNotFoundException("No bill found for user with ID: " + userId));
       bill.setBillStatus("paid");
       return billRepository.save(bill);
    }

    @Override
    public void deleteBill(Long billId) {
        billRepository.findById(billId)
                .orElseThrow(()-> new EntityNotFoundException("No such bill exists with id"+billId));
        billRepository.deleteById(billId);

    }
}
