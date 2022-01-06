package org.acme;

import org.json.JSONObject;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@Path("/hello/person")

public class HelloPersonService {

    JSONObject jason = new JSONObject();

    Person p = new Person("Bob", "Nordfalk Alle");

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Person helloPerson() {
        jason.put("Name", "Mary");
        jason.put("Address", "Nordfalk Alle");

        return p;
    }
}
