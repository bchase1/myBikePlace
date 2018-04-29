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
 * A simple servlet to delete a bike.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/deleteUserBikeRide"}
)

public class DeleteUserBikeRide extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(BikeRides.class);
        int bikeRideId = Integer.parseInt(req.getParameter("id"));
        BikeRides bikeRide = (BikeRides)genericDao.getById(bikeRideId);
        genericDao.delete(bikeRide);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/deleteBikeRideMessage.jsp");
        dispatcher.forward(req, resp);
    }
}


