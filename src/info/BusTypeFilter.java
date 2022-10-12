package info;

import model.Bus;
import model.BusType;

@FunctionalInterface
public interface BusTypeFilter {
    public boolean get(final Bus bus);
}
