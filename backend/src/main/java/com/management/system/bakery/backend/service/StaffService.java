package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.Staff;

import java.util.List;

public interface StaffService {
    List<Staff> getAllStaffs();
    Staff getByName(String name);
    void deleteByName(Long id);
    String createStaff(Staff staff);
    Staff updateStaff(Staff staff);
}
