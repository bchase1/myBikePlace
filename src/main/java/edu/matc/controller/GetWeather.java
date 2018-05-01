package edu.matc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;


public class GetWeather {
    //private OWMSearchResults getJsonResponse(String url) throws IOException {

        Client client = ClientBuilder.newClient();
        //WebTarget target = client.target(url);

        //String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();

        //return mapper.readValue(response, OWMSearchResults.class);
    }
//}
//}
