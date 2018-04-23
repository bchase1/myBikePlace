package edu.matc.controller;

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
 * A simple servlet to get user information by user name.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/searchUserName"}
)

public class SearchUserName extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao;
        genericDao = new GenericDao(User.class);
        req.setAttribute("users", genericDao.getByPropertyLike("userName", req.getRemoteUser()));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/users.jsp");
        dispatcher.forward(req, resp);
    }
}

