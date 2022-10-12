package info;

import model.Bus;
import model.BusType;

public class BusTypeIsLinnker_LM312 implements BusTypeFilter {
    @Override
    public boolean get(final Bus bus) {
        return bus.getBusType().equals(BusType.Linkker_LM312);
    }
}
