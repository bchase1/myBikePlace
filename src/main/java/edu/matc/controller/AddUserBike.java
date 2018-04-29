package edu.matc.controller;
import edu.matc.persistence.GenericDao;
import edu.matc.entity.User;
import edu.matc.entity.Bike;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


/**
 * A simple servlet to add a bike.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/addUserBike"}
)

public class AddUserBike extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(User.class);
        Bike bike = new Bike();
        bike.setModelYear(req.getParameter("modelYear"));
        bike.setBikeBrand(req.getParameter("bikeBrand"));
        bike.setBikeName(req.getParameter("bikeName"));
        bike.setAccessories(req.getParameter("accessories"));
        List<User> users = genericDao.getByPropertyEqual("userName", req.getRemoteUser());
        User user = users.get(0);
        bike.setUser(user);
        user.addBike(bike);
        int id = genericDao.insert(bike);
        req.setAttribute("bike", genericDao.getById(id));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addBikeMessage.jsp");
        dispatcher.forward(req, resp);
    }
}

