package edu.matc.controller;
import edu.matc.persistence.GenericDao;
import edu.matc.entity.User;
import edu.matc.entity.BikeRides;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;


/**
 * A simple servlet to add a bike ride.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/addUserBikeRide"}
)

public class AddUserBikeRide extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(User.class);
        BikeRides bikeRides = new BikeRides();
        String miles_ridden = req.getParameter("milesRidden");
        int milesRidden = Integer.parseInt(miles_ridden);
        bikeRides.setMilesRidden(milesRidden);
        bikeRides.setRideDescription(req.getParameter("rideDescription"));
        String user_id = req.getParameter("user_id");
        int userId = Integer.parseInt(user_id);
        User user = (User)genericDao.getById(userId);
        bikeRides.setUser(user);
        user.addBikeRide(bikeRides);
        int id = genericDao.insert(bikeRides);
        req.setAttribute("bikeRides", genericDao.getById(id));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addBikeRideMessage.jsp");
        dispatcher.forward(req, resp);
    }
}

