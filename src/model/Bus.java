package model;

public class Bus {

    Route route;
    BusType busType;
    Integer busNumber;
    Integer busQuantity;
    Carpool carpool;

    public Bus(Route route, BusType busType, Integer busNumber, Integer busQuantity, Carpool carpool) {
        this.route = route;
        this.busType = busType;
        this.busNumber = busNumber;
        this.busQuantity = busQuantity;
        this.carpool = carpool;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
    }

    public Integer getBusQuantity() {
        return busQuantity;
    }

    public void setBusQuantity(Integer busQuantity) {
        this.busQuantity = busQuantity;
    }

    public Carpool getCarpool() {
        return carpool;
    }

    public void setCarpool(Carpool carpool) {
        this.carpool = carpool;
    }

    public Integer getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(Integer busNumber) {
        this.busNumber = busNumber;
    }
}
