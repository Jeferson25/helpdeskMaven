package com.jefersontecnologia.helpdesk.services;

import com.jefersontecnologia.helpdesk.models.Role;

import java.util.List;

public interface RoleService {
   public List<Role> findAll();
   public Role create(Role role);
   public Boolean delete(Long id);
}

