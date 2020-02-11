package by.stormnet.levkovets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {

    @RequestMapping("/logout")
    public ModelAndView logOut(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

}
