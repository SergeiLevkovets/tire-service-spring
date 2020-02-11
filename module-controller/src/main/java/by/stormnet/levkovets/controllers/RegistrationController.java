package by.stormnet.levkovets.controllers;

import by.stormnet.levkovets.dao.UserDAO;
import by.stormnet.levkovets.domains.Role;
import by.stormnet.levkovets.domains.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@Controller
public class RegistrationController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping("/registration")
    public ModelAndView showRegistrationPage() {
        ModelAndView modelAndView = new ModelAndView("registration");
        return modelAndView;
    }

    @PostMapping("/registration")
    public ModelAndView saveUser(User user) {

        user.setRole(Collections.singletonList(Role.USER));
        userDAO.save(user);

        ModelAndView modelAndView = new ModelAndView("redirect:users");
        return modelAndView;
    }

    @ModelAttribute(name = "user")
    private User getEmptyUser() {
        return new User();
    }

}
