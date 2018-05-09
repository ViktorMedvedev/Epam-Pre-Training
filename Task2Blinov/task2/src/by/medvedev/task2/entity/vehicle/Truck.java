package by.medvedev.task2.entity.vehicle;

import java.util.UUID;

public class Truck {
    private long Id;
    private int capacityInTons;
    private boolean perishableCargo;
    private boolean isEmpty;

    public Truck(int capacityInTons, boolean perishableCargo, boolean isEmpty) {
        Id = Math.abs(UUID.randomUUID().getMostSignificantBits());
        this.capacityInTons = capacityInTons;
        this.perishableCargo = perishableCargo;
        this.isEmpty = isEmpty;
    }

    public long getId() {
        return Id;
    }

    public int getCapacityInTons() {
        return capacityInTons;
    }

    public void setCapacityInTons(int capacityInTons) {
        this.capacityInTons = capacityInTons;
    }

    public boolean isHasPerishableCargo() {
        return perishableCargo;
    }

    public void setHasPerishableCargo(boolean hasPerishableCargo) {
        this.perishableCargo = hasPerishableCargo;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truck truck = (Truck) o;

        if (Id != truck.Id) return false;
        if (capacityInTons != truck.capacityInTons) return false;
        if (perishableCargo != truck.perishableCargo) return false;
        return isEmpty == truck.isEmpty;
    }

    @Override
    public int hashCode() {
        int result = (int) (Id ^ (Id >>> 32));
        result = 31 * result + capacityInTons;
        result = 31 * result + (perishableCargo ? 1 : 0);
        result = 31 * result + (isEmpty ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Id=" + Id +
                ", capacityInTons=" + capacityInTons +
                ", hasPerishableCargo=" + perishableCargo +
                ", isEmpty=" + isEmpty +
                '}';
    }


}
