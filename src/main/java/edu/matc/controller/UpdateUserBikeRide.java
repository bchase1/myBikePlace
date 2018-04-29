package edu.matc.controller;
import edu.matc.entity.BikeRides;
import edu.matc.persistence.GenericDao;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;


/**
 * A simple servlet to update a bike ride description.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/updateUserBikeRide"}
)

public class UpdateUserBikeRide extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(BikeRides.class);
        int bikeRideId = Integer.parseInt(req.getParameter("id"));
        BikeRides bikeRide = (BikeRides)genericDao.getById(bikeRideId);
        String newBikeDescription = req.getParameter("rideDescription");
        bikeRide.setRideDescription(newBikeDescription);
        genericDao.saveOrUpdate(bikeRide);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/updateBikeRideMessage.jsp");
        dispatcher.forward(req, resp);
    }
}


