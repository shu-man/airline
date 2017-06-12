package edu.mum.cs545.ws;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import cs545.airline.model.Airline;
import cs545.airline.model.Airplane;
import cs545.airline.model.Airport;
import cs545.airline.service.AirlineService;
import cs545.airline.service.AirplaneService;
import cs545.airline.service.AirportService;

import java.util.List;
/**
 * Created by Hatake on 6/9/2017.
 */

@Named
@Path("airpot")

public class AirportRest {
    @Inject
    private AirportService airportService;

    @Path("retrieve")
    @GET
    public List<Airport> getAllAirpots()
    {
        try{
            return airportService.findAll();
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

    public Response createAirpot(Airport airport){
        try{
            airportService.create(airport);
            return Response.ok().entity(airport).build();
        }
        catch (Exception e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }

    @Path("delete/{id}")
    @DELETE

    public Response deleteAirpot(@PathParam("id") int id){
        try{
            Airport airport=new Airport();
            airport.setId(id);
            airport=airportService.find(airport);
            airportService.delete(airport);
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

    public Response updateAirpot(Airport airport){
        try{
            airportService.update(airport);
            return Response.ok().entity(airport).build();
        }
        catch (Exception e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }

}
