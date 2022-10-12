package info;

import model.Bus;
import model.BusType;

public class BusTypeIsMercedes_Benz_Citaro implements BusTypeFilter{
    @Override
    public boolean get(Bus bus) {
        return bus.getBusType().equals(BusType.Mercedes_Benz_Citaro);
    }
}
