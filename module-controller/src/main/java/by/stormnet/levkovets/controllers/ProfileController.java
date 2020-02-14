package by.stormnet.levkovets.controllers;

import by.stormnet.levkovets.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.AuthProvider;

@Controller
public class ProfileController {

    @RequestMapping("/profile")
    public ModelAndView showProfilePage(){
        ModelAndView modelAndView = new ModelAndView("profile");
        return modelAndView;
    }

    @ModelAttribute(name = "user")
    private UserDTO getEmptyUser() {
        return new UserDTO();
    }

}
