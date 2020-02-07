package by.stormnet.levkovets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;

@Controller
public class LogoutController extends HttpServlet {

    @RequestMapping("/logout")
    public ModelAndView logOut(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

   /* @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        Integer authorizedUserId = (Integer) httpSession.getAttribute("authorizedUserId");
        if (authorizedUserId != null) {
            httpSession.removeAttribute("authorizedUserId");
            httpSession.removeAttribute("authorizedUserName");
            httpSession.removeAttribute("authorizedUserRole");
        }
        req.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(req, resp);
    }*/
}
