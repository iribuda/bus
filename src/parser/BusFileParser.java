package parser;

import model.Bus;

import java.util.ArrayList;

public interface BusFileParser {

    public ArrayList<Bus> parseLinesFromFile();
    public Bus parseFromFile(int n);
    public ArrayList<Bus> getBuses();
}
