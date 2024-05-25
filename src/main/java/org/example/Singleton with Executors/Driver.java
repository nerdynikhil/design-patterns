package org.example.Singleton;

import java.sql.SQLOutput;
import java.util.concurrent.*;

public class Driver {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> TVSet.getTVSetInstance());
        executor.execute(() -> TVSet.getTVSetInstance());

    }
}
