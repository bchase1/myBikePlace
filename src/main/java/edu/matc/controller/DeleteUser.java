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
 * A simple servlet to delete a user.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/deleteUser"}
)

public class DeleteUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(User.class);
        int id = Integer.parseInt(req.getParameter("id"));
        User user = (User)genericDao.getById(id);
        genericDao.delete(user);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/deleteUserMessage.jsp");
        dispatcher.forward(req, resp);
    }
}

