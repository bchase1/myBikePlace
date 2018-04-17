package edu.matc.controller;
import edu.matc.persistence.GenericDao;
import edu.matc.entity.Bike;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;


/**
 * A simple servlet to update a bike's accessories.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/updateUserBike"}
)

public class UpdateUserBike extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        GenericDao genericDao = new GenericDao(Bike.class);
        int bikeId = Integer.parseInt(req.getParameter("id"));
        Bike bike = (Bike)genericDao.getById(bikeId);
        String newBikeAccessories = req.getParameter("accessories");
        bike.setAccessories(newBikeAccessories);
        genericDao.saveOrUpdate(bike);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/updateBikeMessage.jsp");
        dispatcher.forward(req, resp);
    }
}

