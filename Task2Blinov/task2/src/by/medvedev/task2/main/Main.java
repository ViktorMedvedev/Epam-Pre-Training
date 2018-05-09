package by.medvedev.task2.main;

import by.medvedev.task2.entity.logisticbase.LogisticBase;
import by.medvedev.task2.thread.AddingToQueueThread;
import by.medvedev.task2.thread.TerminalThread;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        LogisticBase base = LogisticBase.INSTANCE;
        base.setNumberOfTerminals(10);
        base.setMaxWarehouseCapacity(5000);
        base.setWarehouseLoad(2500);
        ReentrantLock lock = new ReentrantLock();
        Thread addingThread = new AddingToQueueThread(lock);
        int numberOfTerminals = base.getNumberOfTerminals();
        addingThread.start();
        for (int i = 0; i<numberOfTerminals; i++) {
            Thread terminalThread = new TerminalThread(lock);
            terminalThread.start();
        }

    }
}
