package info;

import parser.BusFileParser;

public class BusAnalyzer {
    BusFileParser busDatFileParser;
    Information information;

    public BusAnalyzer(BusFileParser busDatFileParser) {
        this.busDatFileParser = busDatFileParser;
        setInformation();
    }

    public void showAllBuses(){
        busDatFileParser.getBuses();
        System.out.println("===== All buses in the system: =====");
        System.out.println(busDatFileParser.getBuses());
    }

    public void setInformation(){
        this.information = new Information(busDatFileParser.getBuses());
    }

    public Information getInformation() {
        return information;
    }
}
