package ifrs.dev;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri= "http://localhost:8081/echo")
public interface ServiceB {

    @GET
    @Path("{echo}")
    @Produces(MediaType.TEXT_PLAIN)
    public String echo(@PathParam("echo") String echo);
}
