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
 * A simple servlet to delete a bike.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/deleteUserBike"}
)

public class DeleteUserBike extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao genericDao = new GenericDao(Bike.class);
        int bikeId = Integer.parseInt(req.getParameter("id"));
        Bike bike = (Bike)genericDao.getById(bikeId);
        genericDao.delete(bike);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/deleteBikeMessage.jsp");
        dispatcher.forward(req, resp);
    }
}

