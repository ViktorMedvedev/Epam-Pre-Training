package by.medvedev.task2.thread;

import by.medvedev.task2.entity.logisticbase.LogisticBase;
import by.medvedev.task2.entity.vehicle.Truck;
import by.medvedev.task2.queue.TruckPriorityQueue;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TerminalThread extends Thread implements LogisticBaseThread {
    private TruckPriorityQueue truckPriorityQueue = TruckPriorityQueue.INSTANCE;
    private LogisticBase base = LogisticBase.INSTANCE;
    private Random random = new Random();
    private ReentrantLock lock;

    public TerminalThread(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < countOfTrucks; i++) {
            try {
                lock.lock();
                if (!truckPriorityQueue.isEmpty()) {
                    Truck truck = truckPriorityQueue.pollTruck();
                    System.out.println(truck.toString() + " is token from queue");
                    if (truck.isEmpty()) {
                        base.setWarehouseLoad(base.getWarehouseLoad() - truck.getCapacityInTons());
                        truck.setEmpty(false);
                        System.out.println(truck.toString() + " is loaded");
                    } else {
                        base.setWarehouseLoad(base.getWarehouseLoad() + truck.getCapacityInTons());
                        truck.setEmpty(true);
                        System.out.println(truck.toString() + " is unloaded");
                    }
                    System.out.println("Base load now is " + base.getWarehouseLoad());
                } else {
                    TimeUnit.SECONDS.sleep(2);
                }

                TimeUnit.SECONDS.sleep(random.nextInt(5));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}
