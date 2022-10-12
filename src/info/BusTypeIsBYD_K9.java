package info;

import model.Bus;
import model.BusType;

public class BusTypeIsBYD_K9 implements BusTypeFilter {
    @Override
    public boolean get(final Bus bus) {
        return bus.getBusType().equals(BusType.BYD_K9);
    }
}
