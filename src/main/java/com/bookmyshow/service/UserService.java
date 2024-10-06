package com.bookmyshow.service;

import com.bookmyshow.domain.User;
import com.bookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long id) throws ClassNotFoundException {
        return  userRepository.findById(id).orElseThrow(() -> new ClassNotFoundException("user with id "+id+" not found."));
    }

}
