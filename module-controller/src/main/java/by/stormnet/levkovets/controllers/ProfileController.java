package by.stormnet.levkovets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {

    @RequestMapping("/authorized/profile")
    public ModelAndView showProfilePage(){
        ModelAndView modelAndView = new ModelAndView("profile");
        return modelAndView;
    }

}
