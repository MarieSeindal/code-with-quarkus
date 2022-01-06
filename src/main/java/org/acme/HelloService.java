package org.acme;

import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class HelloService {
//    JSONObject jsonPerson = new JSONObject();
//
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
//        jsonPerson.put("name", "Klaus");
//        jsonPerson.put("streetname", "Frimestervej");

        return "Hello Hi";
    }
}


