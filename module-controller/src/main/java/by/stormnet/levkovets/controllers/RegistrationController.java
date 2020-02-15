package by.stormnet.levkovets.controllers;

import by.stormnet.levkovets.dto.UserDTO;
import by.stormnet.levkovets.service.RoleService;
import by.stormnet.levkovets.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RegistrationController {

    private final UserService userService;
    private final RoleService roleService;

    public RegistrationController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @RequestMapping("/registration")
    public ModelAndView showRegistrationPage() {
        ModelAndView modelAndView = new ModelAndView("registration");
        return modelAndView;
    }

    @PostMapping("/registration")
    public ModelAndView saveUser(UserDTO user) {

        user.setRole(roleService.getUserRole());

        userService.save(user);

        ModelAndView modelAndView = new ModelAndView("redirect:users");
        return modelAndView;
    }

    @ModelAttribute(name = "user")
    private UserDTO getEmptyUser() {
        return new UserDTO();
    }

}
