package by.stormnet.levkovets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "/index", "/index.html"})
    public String showHomePage(){
        return "index";
    }

    @RequestMapping({"/404"})
    public String show404Page(){
        return "404";
    }

}
