package com.jefersontecnologia.helpdesk.services;


import com.jefersontecnologia.helpdesk.models.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User create(User user);
    public Boolean delete(Long id);
    public Boolean update(Long id, User user);
    public User show(Long id);
}
