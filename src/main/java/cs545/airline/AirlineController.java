package cs545.airline;

import cs545.airline.model.Airline;
import cs545.airline.service.AirlineService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Hatake on 6/11/2017.
 */
@Named
@RequestScoped
public class AirlineController {
    @Inject
    AirlineService airlineService;

    Airline airline;

    public AirlineController() {
        airline=new Airline();
    }


    public Airline getAirline(){
        return airline;
    }

    public void setAirline(Airline airline){
        this.airline=airline;
    }

    public void save(){

        airlineService.create(airline);
    }

    public List<Airline> getAirlines(){

        return airlineService.findAll();
    }

    public void delete(Airline airline){

        airlineService.delete(airline);
    }

    public void update(Airline airline)
    {
        airlineService.update(airline);
    }
}
