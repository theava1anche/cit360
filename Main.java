package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Alexander on 2/28/2017.
 */

public class Main {
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(10);
        System.out.println("Mickey and Minney are going to wave to start the Ride");
        // For the i part it is going to start on therad 1 and end on one less than the i #
        for (int i = 1; i < 4; i++){
            Runnable worker = new DisneyThread(" " + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("Finished all threads for the Disney Ride is going to leave the Station Now");
    }
}
