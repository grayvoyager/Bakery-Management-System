package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.DiningTables;
import com.management.system.bakery.backend.exceptions.EntityNotFoundException;
import com.management.system.bakery.backend.respository.DiningTablesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DiningTablesServiceImpl implements DiningTablesService{

    private DiningTablesRepository diningTablesRepository;
   @Override
    public int totalreservedTables(List<DiningTables> DiningTablelist) {
        List<DiningTables> reservedTables = diningTablesRepository.findByStatus("unreserved");
        return reservedTables.size();    }

    @Override
    public DiningTables findByName(String name) {
       return diningTablesRepository.findByName(name)
               .orElseThrow(()-> new EntityNotFoundException("No tables have been reserved by"+ name));
    }


}
