package info;

import model.Carpool;
import model.Route;
import parser.BusDatFileParser;
import parser.BusFileParser;

public class App {

    public static void main(String[] args) {

        System.out.println("===== Initialize data from file =====");
        BusFileParser busFileParser = new BusDatFileParser();
        busFileParser.parseLinesFromFile();

        System.out.println();
        BusAnalyzer busAnalyzer = new BusAnalyzer(busFileParser);
        busAnalyzer.setInformation();
        busAnalyzer.showAllBuses();

        Information information = busAnalyzer.getInformation();
        information.getAllBusesQuantity();

        Route route1 = new Route(1, "12 district", "Dordoi");
        information.getAllBusesWithRoute(route1);

        information.getRouteByBusNum(11);

        Carpool carpool2 = new Carpool(2, "L169");
        information.getRoutesByCarpool(carpool2);
    }
}
