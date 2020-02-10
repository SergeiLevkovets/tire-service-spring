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

    private static final String MESSAGE = "<strong style=\"color: red\">Введены неверные данные</strong>";
    private static final String EMAIL_MESSAGE = "<strong style=\"color: red\">Такой Email уже существует</strong>";
    private static final String PHONE_MESSAGE = "<strong style=\"color: red\">Такой номер уже существует</strong>";

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


   /* @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        if (isNoValid(req)) {
            req.getRequestDispatcher("/WEB-INF/pages/registration.jsp").forward(req, resp);
            return;
        }

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String password = req.getParameter("password");

        UserDTO userDto = new UserDTO();
        userDto.setName(name);
        userDto.setEmail(email);
        userDto.setPhone(phone);
        userDto.setPassword(password);

        UserService userService = ServiceFactory.getFactory().getUserService();
        Integer userId = userService.saveOrUpdate(userDto);

        HttpSession session = req.getSession();

        session.setAttribute("authorizedUserId", userId);
        session.setAttribute("authorizedUserName", userDto.getName());

        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath + "/index.html");

    }

    private boolean isNoValid(HttpServletRequest req) {

        Map<String, String> errorMap = new HashMap<>();

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirm_password");

        UserService userService = ServiceFactory.getFactory().getUserService();
        List<UserDTO> allUsers = userService.getAll();

        if (StringUtils.isBlank(name)) {
            errorMap.put("name_error", MESSAGE);
        }

        if (StringUtils.isBlank(email)) {
            errorMap.put("email_error", MESSAGE);
        }

        if (StringUtils.isBlank(phone)) {
            errorMap.put("phone_error", MESSAGE);
        }

        if (StringUtils.isBlank(password)) {
            errorMap.put("password_error", MESSAGE);
        }

        if (StringUtils.isBlank(confirmPassword) || !password.equals(confirmPassword)) {
            errorMap.put("confirm_password_error", MESSAGE);
        }

        if (StringUtils.isNotBlank(email)) {
            for (UserDTO user : allUsers) {
                if (user.getEmail().equals(email)) {
                    errorMap.put("email_error", EMAIL_MESSAGE);
                    break;
                }
            }
        }
        if (StringUtils.isNotBlank(email)) {
            for (UserDTO user : allUsers) {
                String userPhone = StringUtils.simplePhoneNumber(user.getPhone());
                String phoneNumber = StringUtils.simplePhoneNumber(phone);
                if (userPhone.equals(phoneNumber)) {
                    errorMap.put("phone_error", PHONE_MESSAGE);
                    break;
                }
            }
        }


        if (errorMap.isEmpty()) {
            return false;
        }

        for (String key : errorMap.keySet()) {
            req.setAttribute(key, errorMap.get(key));
        }
        return true;
    }
*/

}
