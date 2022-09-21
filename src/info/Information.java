package info;

import model.Bus;
import model.Carpool;
import model.Route;

import java.util.ArrayList;

public class Information {
    ArrayList<Bus> buses;

    public Information(ArrayList<Bus> buses) {
        this.buses = buses;
    }

    public Integer getAllBusesQuantity(){
        System.out.println("=========");
        System.out.println("All buses quantity in the system: " + buses.size());
        return buses.size();
    }

    public Route getRouteByBusNum(int busNumber){
        Route route = null;
        for (Bus current : buses) {
            if (current.getBusNumber().equals(busNumber)) {
                route = current.getRoute();
                System.out.println("The route of this bus starts at: " + route.getRouteStart());
                System.out.println("The route of this bus ends at: " + route.getRouteEnd());
            }
        }
        return route;
    }

    public ArrayList<Bus> getAllBusesWithRoute(Route route){
        ArrayList<Bus> busesWithRoute = new ArrayList<>();
        System.out.println("========");
        System.out.println("Buses With the Route " + route.getRouteNumber());
        for(Bus bus: buses){
            if(bus.getRoute().equals(route)){
                busesWithRoute.add(bus);
                System.out.println(bus.getBusNumber() + " " + bus.getBusType());
            }
        }
        return busesWithRoute;
    }

    public ArrayList<Route> getRoutesByCarpool(Carpool carpool){
        System.out.println("========");
        System.out.println("All routes of this carpool: ");
        for (Route route: carpool.getAllRoutes()){
            System.out.println(route.getRouteNumber() + " " + route.getRouteStart() + " " + route.getRouteEnd());
        }
        return carpool.getAllRoutes();
    }
}
