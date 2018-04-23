package edu.matc.controller;
import edu.matc.entity.Role;
import edu.matc.persistence.GenericDao;
import edu.matc.entity.User;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;


/**
 * A simple servlet to register a user.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/addUser"}
)

public class AddUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(User.class);
        User user = new User();
        user.setEmail(req.getParameter("email"));
        user.setFirstName(req.getParameter("firstName"));
        user.setLastName(req.getParameter("lastName"));
        user.setPassword(req.getParameter("pass"));
        user.setUserName(req.getParameter("userName"));

        String roleName = "user";
        String userName = req.getParameter("userName");
        Role role = new Role(user,roleName, userName);
        user.addRole(role);

        int id = genericDao.insert(user);
        req.setAttribute("user", genericDao.getById(id));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addUserMessage.jsp");
        dispatcher.forward(req, resp);
    }
}

