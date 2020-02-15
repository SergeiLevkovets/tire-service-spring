package by.stormnet.levkovets.controllers;

import by.stormnet.levkovets.dto.UserDTO;
import by.stormnet.levkovets.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;


@Controller
public class ProfileController {

    private final UserService userService;

    public ProfileController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/profile")
    public ModelAndView showProfilePage(Authentication authentication){
        UserDTO userDTO =(UserDTO) authentication.getPrincipal();
        ModelAndView modelAndView = new ModelAndView("profile");
        modelAndView.addObject("user", userDTO);
        return modelAndView;
    }

    @RequestMapping(value = "/profile-update", method = RequestMethod.POST)
    public ModelAndView saveUser(UserDTO user) {
        userService.save(user);
        ModelAndView modelAndView = new ModelAndView("redirect:profile");
        return modelAndView;
    }


}
