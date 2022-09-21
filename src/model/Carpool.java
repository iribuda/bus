package model;

import java.util.ArrayList;

public class Carpool {

    Integer carpoolNumber;
    String carpoolName;
    ArrayList<Route> allRoutes = new ArrayList<>();

    public Carpool(Integer carpoolNumber, String carpoolName) {
        this.carpoolNumber = carpoolNumber;
        this.carpoolName = carpoolName;
    }

    public Integer getCarpoolNumber() {
        return carpoolNumber;
    }

    public void setCarpoolNumber(Integer carpoolNumber) {
        this.carpoolNumber = carpoolNumber;
    }

    public String getCarpoolName() {
        return carpoolName;
    }

    public void setCarpoolName(String carpoolName) {
        this.carpoolName = carpoolName;
    }

    public ArrayList<Route> getAllRoutes() {
        return allRoutes;
    }

    public void setAllRoutes(ArrayList<Route> allRoutes) {
        this.allRoutes = allRoutes;
    }
}
