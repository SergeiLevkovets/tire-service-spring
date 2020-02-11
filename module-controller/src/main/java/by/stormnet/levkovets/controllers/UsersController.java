package by.stormnet.levkovets.controllers;

import by.stormnet.levkovets.dao.UserDAO;
import by.stormnet.levkovets.domains.Role;
import by.stormnet.levkovets.domains.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Controller
public class UsersController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping("/users")
    public ModelAndView showRegistrationPage() {
        ModelAndView modelAndView = new ModelAndView("users");
        return modelAndView;
    }

    @RequestMapping("/update-user")
    public ModelAndView updateUser(@RequestParam(name = "user_id") Integer userId) {
        ModelAndView modelAndView = new ModelAndView("users");

        Optional<User> user = userDAO.findById(userId);
        User user1 = user.get();
        modelAndView.addObject("user", user1);

        return modelAndView;
    }

    @RequestMapping("/delete-user")
    public ModelAndView deleteUser(@RequestParam(name = "user_id") Integer userId) {
        userDAO.deleteById(userId);

        ModelAndView modelAndView = new ModelAndView("redirect:users");
        return modelAndView;
    }

    @RequestMapping(value = "/save-user", method = RequestMethod.POST)
    public ModelAndView saveUser(User user) {
        userDAO.save(user);

        ModelAndView modelAndView = new ModelAndView("redirect:users");
        return modelAndView;
    }

    @ModelAttribute(name = "usersList")
    private Iterable<User> getUserList() {
        Iterable<User> userList = userDAO.findAll();
        return userList;
    }

    @ModelAttribute(name = "role")
    private Set<Role> getRoleList() {

        Set<Role> set = new HashSet<>(Arrays.asList(Role.values()));

        return set;
    }

    @ModelAttribute(name = "user")
    private User getEmptyUser() {
        return new User();
    }

}
