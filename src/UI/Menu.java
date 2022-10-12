package UI;

import exception.*;
import info.*;
import model.BusType;
import model.Carpool;
import parser.BusDatFileParser;
import parser.BusFileParser;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Menu {

    BusFileParser busFileParser;
    BusAnalyzer busAnalyzer;
    Information information;

    public Menu(){
        this.busFileParser = new BusDatFileParser();
        busFileParser.parseLinesFromFile();
        this.busAnalyzer = new BusAnalyzer(busFileParser);
        System.out.println("===== Initialize data from file =====");
        information = busAnalyzer.getInformation();
    }

    public void greet() throws NumberOutOfRangeException {
        System.out.println("Hello, dear user!");
        System.out.println("The bus system management application welcomes you.");
        showMenu();
    }

    public void showMenu() throws NumberOutOfRangeException {
        System.out.println();
        System.out.println("Menu: ");
        System.out.println("1 - show all buses in the system" +
                "\n2 - show the quantity of all the buses in the system" +
                "\n3 - get route by the number of the bus" +
                "\n4 - get all buses with the route" +
                "\n5 - get routes by carpool" +
                "\n6 - get the quantity of buses of type");
        System.out.print(">>> Please enter the number of function you need: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        while(option != 0) {
            switch (option) {
                case 1:
                    initializeData();
                    showMenu();
                    break;
                case 2:
                    showQuantity();
                    showMenu();
                    break;
                case 3:
                    getRouteByBusNum();
                    showMenu();
                    break;
                case 4:
                    getAllBusesWithRoute();
                    showMenu();
                    break;
                case 5:
                    getRoutesByCarpool();
                    showMenu();
                    break;
                case 6:
                    getBusesOfType();
                    showMenu();
                    break;
                default:
                    throw new NumberOutOfRangeException();
            }
        }
    }

    public void initializeData(){
        System.out.println("==============");
        busAnalyzer.showAllBuses();
    }

    public void showQuantity(){
        System.out.println("==============");
        information.getAllBusesNumberQuantity();
        information.getAllBusesQuantity();
    }

    public void getRouteByBusNum(){
        System.out.println("==============");
        System.out.print(">>> Enter the number of the bus: ");
        Scanner in = new Scanner(System.in);
        int busNumber = in.nextInt();
        information.getRouteByBusNum(busNumber);
    }

    public void getAllBusesWithRoute(){
        System.out.println("==============");
        System.out.print(">>> Enter the required bus stop: ");
        Scanner in = new Scanner(System.in);
        String stop = in.nextLine();
        information.getAllBusesWithRoute(stop);
    }

    public void getRoutesByCarpool() throws NumberOutOfRangeException {
        System.out.println("==============");
        System.out.println("Carpools in the system: ");
        int i = 1;
        ArrayList<Carpool> carpools = new ArrayList<>(busAnalyzer.getCarpools());
        for (Carpool carpool: carpools){
            System.out.println(i + " - " + carpool.getCarpoolName());
            i++;
        }
        System.out.print(">>> Enter the required carpool number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number > carpools.size() || number == 0){
            throw new NumberOutOfRangeException();
        }
        information.getRoutesByCarpool(carpools.get(number-1));
    }

    public void getBusesOfType() throws NumberOutOfRangeException {
        System.out.println("==============");
        System.out.println("All bus types:");
        int i = 1;
        for (BusType busType: BusType.values()){
            System.out.println(i + " - " + busType.getValue());
            i++;
        }
        System.out.print(">>> Enter the number of required bus type / model: ");
        Scanner in = new Scanner(System.in);
        int carpool = in.nextInt();
        switch (carpool){
            case 1:
                information.getBusesByType(new BusTypeIsBYD_K9());
                break;
            case 2:
                information.getBusesByType(new BusTypeIsMercedes_Benz_Citaro());
                break;
            case 3:
                information.getBusesByType(new BusTypeIsVolvo_B7RLE());
                break;
            case 4:
                information.getBusesByType(new BusTypeIsLinnker_LM312());
                break;
            default:
                throw new NumberOutOfRangeException();
        }
    }


}
