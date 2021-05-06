package it.unisannio.presentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ConverterService {
    @GET
    @Path("/")
    Response convert(@FormParam("euro") double euro);
}
