package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.Staff;
import com.management.system.bakery.backend.exceptions.EntityNotFoundException;
import com.management.system.bakery.backend.respository.StaffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StaffServiceImpl implements StaffService{
    private StaffRepository staffRepository;
    @Override
    public List<Staff> getAllStaffs() {
        return staffRepository.findAll();
    }

    @Override
    public Staff getByName(String staffName) {
        return staffRepository.findByName(staffName)
                .orElseThrow(()->new EntityNotFoundException("Not found!!"));
    }

    @Override
    public void deleteByName(Long id) {
        staffRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Not found!!"));
        staffRepository.deleteById(id);
    }

    @Override
    public String createStaff(Staff staff) {
        staffRepository.save(staff);
        return "New staff successfully created";
    }

    @Override
    public Staff updateStaff(Staff updatedstaff) {
        Staff existingStaff= staffRepository.findByName(updatedstaff.getName())
                .orElseThrow(()->new EntityNotFoundException("No such staff exists; create first."));
        existingStaff.setName(updatedstaff.getName());
        existingStaff.setDesignation(updatedstaff.getDesignation());
        existingStaff.setShift(updatedstaff.getShift());
        return staffRepository.save(existingStaff);
    }
}
