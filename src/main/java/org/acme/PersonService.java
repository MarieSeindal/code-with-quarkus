package org.acme;


import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello/person")
public class PersonService {

    JSONObject person = new JSONObject();

    Person p = new Person("RockyRoad", "Alice");

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        person.put("Address", p.getAddress());
        person.put("Name", p.getName());

        return person.toString();
    }

}
