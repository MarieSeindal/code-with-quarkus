package org.acme;

import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class HelloService {
    String string = "Hello";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
       return string;
    }
}


