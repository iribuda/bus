package info;

import model.Bus;
import model.BusType;

public class BusTypeIsVolvo_B7RLE implements BusTypeFilter {
    @Override
    public boolean get(final Bus bus) {
        return bus.getBusType().equals(BusType.Volvo_B7RLE);
    }
}
