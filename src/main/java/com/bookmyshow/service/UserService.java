package com.bookmyshow.service;

import com.bookmyshow.domain.User;

public interface UserService {
    public User saveUser(User user);
    public User getUser(Long id) throws ClassNotFoundException;
}
