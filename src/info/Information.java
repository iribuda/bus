package info;

import model.Bus;
import model.Carpool;
import model.Route;

import java.util.ArrayList;
import java.util.Set;

public class Information {
    ArrayList<Bus> buses;
    Set<Carpool> carpools;

    public Information(ArrayList<Bus> buses, Set<Carpool> carpoolSet) {
        this.buses = buses;
        this.carpools = carpoolSet;
    }

    public Integer getAllBusesNumberQuantity(){
        System.out.println("All buses by number quantity in the system: " + buses.size());
        return buses.size();
    }

    public Integer getAllBusesQuantity(){
        int sum = 0;
        for (Bus b: buses){
            sum += b.getBusQuantity();
        }
        System.out.println("All buses quantity in the system: " + sum);
        return sum;
    }

    public Route getRouteByBusNum(int busNumber){
        Route route = null;
        System.out.println("Number of the bus #" + busNumber + ": ");
        for (Bus current : buses) {
            if (current.getBusNumber().equals(busNumber)) {
                route = current.getRoute();
                System.out.println("The route number is" + route.getRouteNumber());
                System.out.println("The route of this bus starts at: " + route.getRouteStart());
                System.out.println("The route of this bus ends at: " + route.getRouteEnd());
            }
        }
        return route;
    }

    public ArrayList<Bus> getAllBusesWithRoute(String routeStartOrEnd){
        ArrayList<Bus> busesWithRoute = new ArrayList<>();
        System.out.println("Buses With the Route " + routeStartOrEnd);
        for(Bus bus: buses){
            if(bus.getRoute().getRouteStart().equals(routeStartOrEnd) ||
                bus.getRoute().getRouteEnd().equals(routeStartOrEnd)){
                busesWithRoute.add(bus);
                System.out.println("Bus # " + bus.getBusNumber() + " with start stop at " + bus.getRoute().getRouteStart() + " and end stop at " + bus.getRoute().getRouteEnd());
            }
        }
        return busesWithRoute;
    }

    public ArrayList<Route> getRoutesByCarpool(Carpool carpool){
        System.out.println("All routes of carpool: " + carpool.getCarpoolName());
        ArrayList<Route> routes = new ArrayList<>();
        for (Carpool c: carpools){
            if (c.equals(carpool)){
                for (Route route: c.getAllRoutes()){
                    System.out.println("Route #" + route.getRouteNumber() + ". Start: " + route.getRouteStart() + ". End: " + route.getRouteEnd());
                    routes.add(route);
                }
            }
        }
        if (routes.size()==0){
            System.out.println("There is no such carpool!");
        }
        return routes;
    }

    public ArrayList<Bus> getBusesByType(BusTypeFilter busTypeFilter){
        ArrayList<Bus> busesOfType = new ArrayList<>();
        for(Bus bus: buses){
            if (busTypeFilter.get(bus)){
                busesOfType.add(bus);
                System.out.println("Bus #" + bus.getBusNumber() + " from " + bus.getCarpool().getCarpoolName() + " Carpool is of type" + bus.getBusType().getValue());
            }
        }
        return busesOfType;
    }

    public ArrayList<Bus> getBuses() {
        return buses;
    }
}