package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.Role;
import com.management.system.bakery.backend.exceptions.EntityNotFoundException;
import com.management.system.bakery.backend.respository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role findByRoleType(String roleType) {
        return roleRepository.findByRoleType(roleType)
                .orElseThrow(()-> new EntityNotFoundException("Role with "+roleType+"not found!!"));
    }

    @Override
    public Role findByRoleId(Long roleId) {
        return roleRepository.findById(roleId)
                .orElseThrow(()-> new EntityNotFoundException("Role with"+roleId+"not found!!"));
    }

    @Override
    public void deleteById(Long roleId) {
        roleRepository.findById(roleId)
                .orElseThrow(()->new EntityNotFoundException("Role with role id "+roleId+" not found!!"));
        roleRepository.deleteById(roleId);

    }
}
