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
        carpool1.addRoute(route1);
        Bus bus1 = new Bus(route1, BusType.BYD_K9, 12,20, carpool1);
        buses.add(bus1);

        Route route2 = new Route(2, "Kok-Zhar", "Besh-Kungey");
        Carpool carpool2 = new Carpool(2, "L169");
        carpool2.addRoute(route2);
        Bus bus2 = new Bus(route2, BusType.Linkker_LM312, 11, 30, carpool2);
        buses.add(bus2);

        Route route3 = new Route(3, "Ala-Archa", "Lebedinovka");
        Carpool carpool3 = new Carpool(3, "MB12");
        carpool3.addRoute(route3);
        Bus bus3 = new Bus(route3, BusType.Mercedes_Benz_Citaro, 10, 40, carpool3);
        buses.add(bus3);

        Route route4 = new Route(4, "Alamedin", "Ala-Archa");
        carpool3.addRoute(route4);
        Bus bus4 = new Bus(route4, BusType.Volvo_B7RLE, 20, 40, carpool3);
        buses.add(bus4);

        Route route5 = new Route(5,"Ak-Orgo", "Tungutch");
        carpool2.addRoute(route5);
        Bus bus5 = new Bus(route5, BusType.BYD_K9, 7, 25, carpool2);
        buses.add(bus5);

        Route route6 = new Route(6, "West Autostation", "12 district");
        carpool1.addRoute(route6);
        Bus bus6 = new Bus(route6, BusType.Mercedes_Benz_Citaro, 4, 20, carpool1);
        buses.add(bus6);
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
