package edu.matc.controller;

import edu.matc.persistence.OwmWeather;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * A simple servlet to get the weather.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/getWeather"}
)
public class GetWeather extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            OwmWeather owmWeather = new OwmWeather();
            req.setAttribute("theWeather", owmWeather.owmApi());
            RequestDispatcher dispatcher = req.getRequestDispatcher("/showWeather.jsp");
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    //public void getOwmWeather() {
        //OwmWeather owmWeather = new OwmWeather();
        //try {
            //owmWeather.owmApi();
        //} catch (Exception e) {
            //e.printStackTrace();
        //}
    //}
}

