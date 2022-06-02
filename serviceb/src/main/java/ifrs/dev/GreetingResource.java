package ifrs.dev;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/echo")
public class GreetingResource {

    private static final Logger LOGGER = Logger.getLogger(GreetingResource.class.getName());

    @GET
    @Path("{echo}")
    @Produces(MediaType.TEXT_PLAIN)
    public String echo(@PathParam("echo") String echo) {
        LOGGER.info("Estou no service B");
        return echo;
    }
}