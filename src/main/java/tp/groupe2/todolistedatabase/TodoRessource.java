package tp.groupe2.todolistedatabase;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/todos")
public class TodoRessource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Liste des todo à faire";
    }
}