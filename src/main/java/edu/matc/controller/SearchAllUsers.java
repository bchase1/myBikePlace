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
 * A simple servlet to get all users.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/searchAllUsers"}
)

public class SearchAllUsers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao;
        genericDao = new GenericDao(User.class);
        req.setAttribute("users", genericDao.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/allUsers.jsp");
        dispatcher.forward(req, resp);
    }
}

