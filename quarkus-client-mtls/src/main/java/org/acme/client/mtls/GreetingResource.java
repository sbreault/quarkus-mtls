package org.acme.client.mtls;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.google.inject.Inject;


@Path("/hello-client")
public class GreetingResource {

    @Inject
    @RestClient
    GreetingService greetingservice;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetingservice.hello();
    }
}