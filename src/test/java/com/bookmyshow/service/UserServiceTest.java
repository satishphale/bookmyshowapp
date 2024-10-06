package com.bookmyshow.service;

import com.bookmyshow.domain.User;
import com.bookmyshow.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    @Test
    public void getUserSuccess() throws ClassNotFoundException {
        User user = new User();
        user.setId(1L);
        user.setName("satish");
        Mockito.when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        User user1 = userService.getUser(1L);

        Assert.assertNotNull(user1);
        Assert.assertEquals(user1.getId().longValue(),1L);
    }




}
