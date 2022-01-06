package org.acme;


import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello/person")
public class PersonService {
    JSONObject jsonPerson = new JSONObject();

    Person p1 = new Person("Anne", "frimestervej");


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        jsonPerson.put("streetname", p1.street);
        jsonPerson.put("name", p1.name);

        return jsonPerson.toString();

    }

}

