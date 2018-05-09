package by.medvedev.task2.thread;

import by.medvedev.task2.entity.vehicle.Truck;
import by.medvedev.task2.queue.TruckPriorityQueue;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class AddingToQueueThread extends Thread implements LogisticBaseThread {
    private ReentrantLock lock;

    public AddingToQueueThread(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        TruckPriorityQueue truckPriorityQueue = TruckPriorityQueue.INSTANCE;
        Random random = new Random();
        int capacity = 20;

        for (int i = 0; i < countOfTrucks; i++) {

            try {
                Truck truck = new Truck(capacity, random.nextBoolean(), random.nextBoolean());
                truckPriorityQueue.addTruck(truck);
                System.out.println(truck.toString() + " added to queue");
                TimeUnit.SECONDS.sleep(random.nextInt(5));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
