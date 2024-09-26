package com.YannGI.webapp.controller;
import com.YannGI.webapp.model.User;
import com.YannGI.webapp.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController
{
    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl)
    {
        this.userServiceImpl = userServiceImpl;
    }

  /*  @GetMapping("/")
    public ModelAndView hometabView(@ModelAttribute("patient") Patient patient )
    {
        return new ModelAndView("hometab");
    }*/

    @PostMapping("/signup")
    public ModelAndView processRequest(@ModelAttribute("signUpForm") User user )
    {
        userServiceImpl.registration(user);
        return new ModelAndView("signin");
    }

    @GetMapping("/signup")
    public ModelAndView showRegisterForm()
    {
        return new ModelAndView("signup", "signUpForm", new User());
    }
}

