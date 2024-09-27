package com.YannGI.webapp.service;

import com.YannGI.webapp.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface UserServiceInterface
{
    public User registration(User user);
}
