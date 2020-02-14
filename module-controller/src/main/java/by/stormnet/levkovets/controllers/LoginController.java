package by.stormnet.levkovets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView showLoginPage(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping("/logout")
    public ModelAndView logOut(){
        ModelAndView modelAndView = new ModelAndView("redirect:index");
        return modelAndView;
    }
}
