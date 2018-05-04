package edu.matc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.matc.persistence.OwmWeather;

import javax.servlet.annotation.WebServlet;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * A simple servlet to get the weather.
 * @author bchase
 */

@WebServlet(
        urlPatterns = {"/getWeather"}
)
public class GetWeather {
    public void getOwmWeather() {
        OwmWeather owmWeather = new OwmWeather();
        try {
            owmWeather.owmApi();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //public OWMSearchResults getJsonResponse(String url) throws IOException {

        //Client client = ClientBuilder.newClient();
        //WebTarget target = client.target(url);

        //String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        //ObjectMapper mapper = new ObjectMapper();

        //return mapper.readValue(response, OWMSearchResults.class);
    //}
}

