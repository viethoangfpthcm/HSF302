package edu.fuhcm.lapshop.se678968.service;

import edu.fuhcm.lapshop.se678968.entity.User;

public interface UserService {
    public void createUser(User user);

    public User getByEmail(String email);
}
