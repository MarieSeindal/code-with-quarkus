package org.acme;


import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello/person")
public class PersonService {

    JSONObject person = new JSONObject();
    JSONObject person2 = new JSONObject();

    Person p = new Person("RockyRoad", "Alice");
    Person p2 = new Person("RainbowRoad", "Mario");

    @GET
    @Path("1")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        person.put("Address", p.getAddress());
        person.put("Name", p.getName());

        return person.toString();
    }

    @GET
    @Path("2")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        person2.put("Address", p2.getAddress());
        person2.put("Name", p2.getName());

        return person2.toString();
    }

}
