package by.stormnet.levkovets.controllers;

import by.stormnet.levkovets.dto.UserDTO;
import by.stormnet.levkovets.service.RoleService;
import by.stormnet.levkovets.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class UsersController {

    private final UserService userService;
    private final RoleService roleService;

    public UsersController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @RequestMapping("/users")
    public ModelAndView showUsersPage() {
        ModelAndView modelAndView = new ModelAndView("users");
        return modelAndView;
    }

    @RequestMapping("/update-user")
    public ModelAndView updateUser(@RequestParam(name = "user_id") Integer userId) {
        ModelAndView modelAndView = new ModelAndView("users");
        UserDTO user = userService.getById(userId);
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping("/delete-user")
    public ModelAndView deleteUser(@RequestParam(name = "user_id") Integer userId) {
        userService.delet(userId);
        ModelAndView modelAndView = new ModelAndView("redirect:users");
        return modelAndView;
    }

    @RequestMapping(value = "/save-user", method = RequestMethod.POST)
    public ModelAndView saveUser(UserDTO user) {
        userService.save(user);
        ModelAndView modelAndView = new ModelAndView("redirect:users");
        return modelAndView;
    }

    @ModelAttribute(name = "usersList")
    private Iterable<UserDTO> getUserList() {
        List<UserDTO> userList = userService.getAll();
        return userList;
    }

    @ModelAttribute(name = "role")
    private Iterable<String> getRoleList() {
        return roleService.getAllRoles();
    }

    @ModelAttribute(name = "user")
    private UserDTO getEmptyUser() {
        return new UserDTO();
    }

}
