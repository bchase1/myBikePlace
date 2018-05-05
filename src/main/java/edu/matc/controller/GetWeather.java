package edu.matc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import openweathermap.Response;
import openweathermap.WeatherItem;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * A simple servlet to get the weather.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/getWeather"}
)
public class GetWeather extends HttpServlet {
    String zipCode = "";
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
    public String getZipCode(){
        return zipCode;
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try {
            zipCode = req.getParameter("zipCode");
            setZipCode(zipCode);
            req.setAttribute("zipCode", getZipCode());
            req.setAttribute("theWeather", owmApi());
            RequestDispatcher dispatcher = req.getRequestDispatcher("/showWeather.jsp");
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public String owmApi() throws Exception {
        String zipCode = getZipCode();
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" +zipCode + ",us&appid=6a6c46d4dc5113d20b1e6cf5a286573b";
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Response response1 =  mapper.readValue(response, Response.class);
        WeatherItem weatherItem = response1.getWeather().get(0);
        String theWeather = weatherItem.getMain();
        return theWeather;
    }
}

