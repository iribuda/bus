package UI;

import exception.NumberOutOfRangeException;
import info.BusAnalyzer;
import info.Information;
import model.Carpool;
import model.Route;
import parser.BusDatFileParser;
import parser.BusFileParser;

import java.util.ArrayList;
import java.util.Set;

public class App {

    public static void main(String[] args) throws NumberOutOfRangeException {
        Menu menu = new Menu();
        menu.greet();
    }
}
