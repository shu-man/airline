package edu.mum.cs545.ws;

/**
 * Created by Hatake on 6/9/2017.
 */
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import cs545.airline.model.Airline;
import cs545.airline.model.Airplane;
import cs545.airline.service.AirlineService;
import cs545.airline.service.AirplaneService;

import java.util.List;

@Named
@Path("airplane")
public class AirplaneRest {
    @Inject
    private AirplaneService airplaneService;

    @Path("retrieve")
    @GET
    public List<Airplane> getAllAirlines()
    {
        try{
            return airplaneService.findAll();
        }
        catch (Exception e){
            return null;
        }

        // return Response.status(200).entity(lstAirlines).build();
    }

    @Path("create")
    @POST
    @Consumes("application/json")
    @Produces("application/json")

    public Response createAirplane(Airplane airplane){
        try{
            airplaneService.create(airplane);
            return Response.ok().entity(airplane).build();
        }
        catch (Exception e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }

    @Path("delete/{id}")
    @DELETE

    public Response deleteAirplane(@PathParam("id") int id){
        try{
            Airplane airplane=new Airplane();
            airplane.setId(id);
            airplane=airplaneService.find(airplane);
            airplaneService.delete(airplane);
            return Response.ok().build();
        }
        catch (Exception e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }

    @Path("update")
    @PUT
    @Consumes("application/json")
    @Produces("application/json")

    public Response updateAirplane(Airplane airplane){
        try{
            airplaneService.update(airplane);
            return Response.ok().entity(airplane).build();
        }
        catch (Exception e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }

}
