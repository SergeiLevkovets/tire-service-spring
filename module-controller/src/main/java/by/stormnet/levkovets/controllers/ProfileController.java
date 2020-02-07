package by.stormnet.levkovets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {

    private static final String MESSAGE = "<strong style=\"color: red\">Поле не может быть пустым</strong>";
    private static final String EMAIL_MESSAGE = "<strong style=\"color: red\">Такой Email уже существует</strong>";
    private static final String PHONE_MESSAGE = "<strong style=\"color: red\">Такой номер телефона уже существует</strong>";

    @RequestMapping("/authorized/profile")
    public ModelAndView showProfilePage(){
        ModelAndView modelAndView = new ModelAndView("profile");
        return modelAndView;
    }

   /* @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        Integer id = (Integer) session.getAttribute("authorizedUserId");

        UserService userService = ServiceFactory.getFactory().getUserService();
        UserDTO userDto = userService.getById(id);

        req.setAttribute("name", userDto.getName());
        req.setAttribute("email", userDto.getEmail());
        req.setAttribute("password", userDto.getPassword());
        req.setAttribute("phone", userDto.getPhone());

        req.getRequestDispatcher("/WEB-INF/pages/profile.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        Integer id = (Integer) session.getAttribute("authorizedUserId");

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String password = req.getParameter("password");

        if (isAlreadyExistsNumberOrEmail(req, id, email, phone)) {

            req.getRequestDispatcher("/WEB-INF/pages/profile.jsp").forward(req, resp);
            return;

        }

        UserServiceImpl userService = new UserServiceImpl();
        UserDTO userDto = userService.getById(id);

        if (StringUtils.isNotBlank(name)) {
            userDto.setName(name);
        }

        if (StringUtils.isNotBlank(email)) {
            userDto.setEmail(email);
        }

        if (StringUtils.isNotBlank(phone)) {
            userDto.setPhone(phone);
        }

        if (StringUtils.isNotBlank(password)) {
            userDto.setPassword(password);
        }

        userService.saveOrUpdate(userDto);

        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath + "/authorized/profile");
    }

    private boolean isAlreadyExistsNumberOrEmail(HttpServletRequest req, Integer id, String email, String phone) {

        Map<String, String> errorMap = new HashMap<>();

        UserService userService = ServiceFactory.getFactory().getUserService();
        List<UserDTO> allUsers = userService.getAll();

        for (UserDTO user : allUsers) {

            Integer userId = user.getId();

            if (userId.equals(id)) {
                continue;
            }

            String userEmail = user.getEmail();
            String userPhone = user.getPhone();

            if (StringUtils.isNotBlank(email) && userEmail.equals(email)) {
                errorMap.put("email_error", EMAIL_MESSAGE);
            }

            if (StringUtils.isNotBlank(phone)
                    && StringUtils.simplePhoneNumber(userPhone).equals(StringUtils.simplePhoneNumber(phone))) {
                errorMap.put("phone_error", PHONE_MESSAGE);
            }
        }

        if (!errorMap.isEmpty()) {
            for (String key : errorMap.keySet()) {
                req.setAttribute(key, errorMap.get(key));
            }
            return true;
        }

        return false;
    }*/
}
