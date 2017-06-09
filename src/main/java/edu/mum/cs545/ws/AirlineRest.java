package edu.mum.cs545.ws;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import cs545.airline.model.Airline;
import cs545.airline.service.AirlineService;

import java.util.List;


/**
 * Created by Hatake on 6/8/2017.
 */
@Named
@Path("airline")
public class AirlineRest {
    @Inject
    private AirlineService airlineService;

    @Path("allAirlines")
    @GET
    public List<Airline> getAllAirlines()
    {
        try{
            return airlineService.findAll();
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

    public Response createAirline(Airline airline){
        try{
            airlineService.create(airline);
            return Response.ok().entity(airline).build();
        }
        catch (Exception e){
          return Response.status(500).entity(e.getMessage()).build();
        }
    }

    @Path("delete/{id}")
    @DELETE

    public Response deleteAirline(@PathParam("id") int id){
        try{
            Airline airline=new Airline();
            airline.setId(id);
          airline=airlineService.find(airline);
          airlineService.delete(airline);
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

    public Response updateAirline(Airline airline){
        try{
            airlineService.update(airline);
            return Response.ok().entity(airline).build();
        }
        catch (Exception e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }

}
