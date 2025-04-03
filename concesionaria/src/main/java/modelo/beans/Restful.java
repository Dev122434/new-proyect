package modelo.beans;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import modelo.pojos.Auto;
import persistencia.ControladoraPersistencia;

@Path("test")
public class Restful {

    @Context
    private UriInfo context;

    public Restful() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Auto> getJson() {
        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
        List<Auto> listado = controladoraPersistencia.listarAutos();
        return new ArrayList<>(listado);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(Auto auto) {
        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
        controladoraPersistencia.modificarRegistro(auto);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void postJson(Auto auto) {
        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
        controladoraPersistencia.insertarRegistro(auto);
    }

    @GET
    @Path("/buscarAuto/{clave}")
    @Produces(MediaType.APPLICATION_JSON)
    public String buscarAuto(@PathParam("clave") String clave) {

        ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
        Auto auto = controladoraPersistencia.buscarRegistro(clave);

        Gson json = new Gson();
        String response = json.toJson(auto);
        return response;
    }
}
