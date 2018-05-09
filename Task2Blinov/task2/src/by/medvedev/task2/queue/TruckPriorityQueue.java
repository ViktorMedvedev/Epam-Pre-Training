package by.medvedev.task2.queue;

import by.medvedev.task2.entity.vehicle.Truck;

import java.util.Comparator;
import java.util.PriorityQueue;

public enum TruckPriorityQueue {
    INSTANCE;
    private Comparator<Truck> comparator = new BooleanComparator();
    private PriorityQueue<Truck> priorityQueue = new PriorityQueue<>(comparator);

    public boolean addTruck(Truck truck) {
        if (truck != null) {
            priorityQueue.add(truck);
            return true;
        }
        return false;

    }

    public boolean isEmpty() {
        return priorityQueue.isEmpty();

    }

    public Truck pollTruck() {
        return priorityQueue.poll();
    }

    private class BooleanComparator implements Comparator<Truck> {
        @Override
        public int compare(Truck x, Truck y) {
            // Assume neither string is null. Real code should
            // probably be more robust
            // You could also just return x.length() - y.length(),
            // which would be more efficient.
            if (!x.isHasPerishableCargo() && y.isHasPerishableCargo()) {
                return -1;
            }
            if (x.isHasPerishableCargo() && !y.isHasPerishableCargo()) {
                return 1;
            }
            return 0;
        }
    }
}
