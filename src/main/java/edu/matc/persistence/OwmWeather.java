package edu.matc.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import openweathermap.Response;
import openweathermap.WeatherItem;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class OwmWeather {
    public String owmApi() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("api.openweathermap.org/data/2.5/weather?id=5261457&appid=6a6c46d4dc5113d20b1e6cf5a286573b");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Response response1 =  mapper.readValue(response, Response.class);
        WeatherItem weatherItem = response1.getWeather().get(0);
        String theWeather = weatherItem.getMain();
        return theWeather;
    }
}
