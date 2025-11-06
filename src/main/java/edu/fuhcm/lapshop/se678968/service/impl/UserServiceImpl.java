package edu.fuhcm.lapshop.se678968.service.impl;

import edu.fuhcm.lapshop.se678968.entity.User;
import edu.fuhcm.lapshop.se678968.repository.UserRepository;
import edu.fuhcm.lapshop.se678968.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
