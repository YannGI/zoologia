package com.YannGI.webapp.service.impl;

import com.YannGI.webapp.model.User;
import com.YannGI.webapp.service.UserServiceInterface;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserServiceImpl implements UserServiceInterface
{
    final PasswordEncoder passwordEncoder;

    public UserServiceImpl(PasswordEncoder passwordEncoder)
    {
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public User registration(User user) {
        return null;
    }
}
