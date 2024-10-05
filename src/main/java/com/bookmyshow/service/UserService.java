package com.bookmyshow.service;

import com.bookmyshow.domain.User;
import com.bookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(Long id) throws ClassNotFoundException {
        Optional<User> user =  userRepository.findById(id);
        if(user.isPresent()) {
            return user.get();
        } else {
           throw new ClassNotFoundException();
        }
    }

}
