package by.medvedev.task2.entity.vehicle;

public class Train {
    private int capacity;

    public Train(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        return capacity == train.capacity;
    }

    @Override
    public int hashCode() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Train{" +
                "capacity=" + capacity +
                '}';
    }
}
