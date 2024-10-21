package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.DiningTables;
import com.management.system.bakery.backend.entity.User;

import java.util.List;
import java.util.Optional;

public interface DiningTablesService {
    int totalreservedTables(List<DiningTables> DiningTablelist);
    DiningTables findByName(String name);

}
