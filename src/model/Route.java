package model;

public class Route {

    Integer routeNumber;
    String routeStart;
    String routeEnd;

    public Route(Integer routeNumber, String routeStart, String routeEnd) {
        this.routeNumber = routeNumber;
        this.routeStart = routeStart;
        this.routeEnd = routeEnd;
    }

    public Integer getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(Integer routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getRouteStart() {
        return routeStart;
    }

    public void setRouteStart(String routeStart) {
        this.routeStart = routeStart;
    }

    public String getRouteEnd() {
        return routeEnd;
    }

    public void setRouteEnd(String routeEnd) {
        this.routeEnd = routeEnd;
    }
}
