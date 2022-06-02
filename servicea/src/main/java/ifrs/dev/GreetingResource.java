package ifrs.dev;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/echo")
public class GreetingResource {

    private static final Logger LOGGER = Logger.getLogger(GreetingResource.class.getName());

    @Inject
    @RestClient
    ServiceB service;

    @GET
    @Path("{echo}")
    @Produces(MediaType.TEXT_PLAIN)
    public String echo(@PathParam("echo") String echo) {
        
        LOGGER.info("Estou no service A");
        
        return service.echo(echo);
    }
}