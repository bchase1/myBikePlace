package edu.matc.controller;
import edu.matc.persistence.GenericDao;
import edu.matc.entity.User;
import edu.matc.entity.Bike;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.ws.rs.core.Response;
import java.io.IOException;


/**
 * A simple servlet to add a bike.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/addUserBike"}
)

public class AddUserBike extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(User.class);
        Bike bike = new Bike();
        bike.setModelYear(req.getParameter("modelYear"));
        bike.setBikeBrand(req.getParameter("bikeBrand"));
        bike.setBikeName(req.getParameter("bikeName"));
        bike.setAccessories(req.getParameter("accessories"));
        String user_id = req.getParameter("user_id");
        int userId = Integer.parseInt(user_id);
        User user = (User)genericDao.getById(userId);
        bike.setUser(user);
        user.addBike(bike);
        int id = genericDao.insert(bike);
        req.setAttribute("bike", genericDao.getById(id));
        logger.debug("bike: ", bike);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addBikeMessage.jsp");
        dispatcher.forward(req, resp);
    }
}
