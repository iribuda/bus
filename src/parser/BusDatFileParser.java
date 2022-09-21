package parser;

import model.Bus;
import model.BusType;
import model.Carpool;
import model.Route;

import java.util.ArrayList;
import java.util.Arrays;

public class BusDatFileParser implements BusFileParser{

    ArrayList<Bus> buses = new ArrayList<>();

    @Override
    public ArrayList<Bus> parseLinesFromFile() {
        Route route1 = new Route(1, "12 district", "Dordoi");
        Carpool carpool1 = new Carpool(1, "Vityaz");
        carpool1.setAllRoutes(new ArrayList<>(Arrays.asList(route1)));
        Bus bus1 = new Bus(route1, BusType.BYD_K9, 12,20, carpool1);
        buses.add(bus1);

        Route route2 = new Route(2, "Kok-Zhar", "Besh-Kungey");
        Carpool carpool2 = new Carpool(2, "L169");
        carpool2.setAllRoutes(new ArrayList<>(Arrays.asList(route2)));
        Bus bus2 = new Bus(route2, BusType.Linkker_LM312, 11, 30, carpool2);
        buses.add(bus2);

        Route route3 = new Route(3, "Ala-Archa", "Lebedinovka");
        Carpool carpool3 = new Carpool(3, "MB12");
        carpool3.setAllRoutes(new ArrayList<>(Arrays.asList(route3)));
        Bus bus3 = new Bus(route3, BusType.Mercedes_Benz_Citaro, 10, 40, carpool3);
        buses.add(bus3);
        return buses;
    }

    @Override
    public Bus parseFromFile(int n) {
        return buses.get(n);
    }

    @Override
    public ArrayList<Bus> getBuses() {
        return buses;
    }
}
