package info;

import model.Bus;
import model.Carpool;
import parser.BusFileParser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BusAnalyzer {
    BusFileParser busDatFileParser;
    Information information;

    public BusAnalyzer(BusFileParser busDatFileParser) {
        this.busDatFileParser = busDatFileParser;
        setInformation();
    }

    public void showAllBuses(){
        System.out.println("===== All buses in the system: =====");
        System.out.printf("%3s %24s %8s\n", "No", "Bus model", "Quantity");
        for (Bus b: busDatFileParser.getBuses()){
            System.out.printf("%3d %24s %8d\n", b.getBusNumber(), b.getBusType(), b.getBusQuantity());
        }
    }

    public void setInformation(){
        this.information = new Information(busDatFileParser.getBuses(), getCarpools());
    }

    public Information getInformation() {
        return information;
    }

    public Set<Carpool> getCarpools(){
        ArrayList<Bus> buses = busDatFileParser.getBuses();
        Set<Carpool> carpools = new HashSet<>();
        for (int i=0, n=buses.size(); i<n; i++){
            carpools.add(buses.get(i).getCarpool());
        }
        return carpools;
    }
}
