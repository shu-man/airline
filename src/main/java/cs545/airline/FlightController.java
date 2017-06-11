package cs545.airline;

/**
 * Created by Hatake on 6/10/2017.
 */
import cs545.airline.model.Flight;
import cs545.airline.service.FlightService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class FlightController {
    @Inject
    private FlightService flightService;

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    private List<Flight> flights;

    public List<Flight> allFlights()
    {
        return flightService.findAll();
    }
    @PostConstruct
    private void loadFlights()
    {
        flights=flightService.findAll();
        System.out.println(flights);
    }
}
