package by.medvedev.task2.entity.logisticbase;

public enum LogisticBase {
    INSTANCE();
    private int maxWarehouseCapacity;
    private int warehouseLoad;
    private int numberOfTerminals;


    public int getMaxWarehouseCapacity() {
        return maxWarehouseCapacity;
    }

    public void setMaxWarehouseCapacity(int maxWarehouseCapacity) {
        this.maxWarehouseCapacity = maxWarehouseCapacity;
    }

    public int getWarehouseLoad() {
        return warehouseLoad;
    }

    public void setWarehouseLoad(int warehouseLoad) {
        this.warehouseLoad = warehouseLoad;
    }

    public int getNumberOfTerminals() {
        return numberOfTerminals;
    }

    public void setNumberOfTerminals(int numberOfTerminals) {
        this.numberOfTerminals = numberOfTerminals;
    }

    @Override
    public String toString() {
        return "LogisticBase{" +
                "maxWarehouseCapacity=" + maxWarehouseCapacity +
                ", warehouseLoad=" + warehouseLoad +
                ", numberOfTerminals=" + numberOfTerminals +
                '}';
    }
}

