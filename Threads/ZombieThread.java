package Threads;

/**
 * Created by Alexander on 2/16/2017.
 */
class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    // This is going to start the demo

    ThreadDemo( String nameOfZombie) {
        threadName = nameOfZombie;
        System.out.println("The creation is going to start for the " +  threadName );
    }

    public void run() {
        System.out.println("The zombies are going after the people now " +  threadName );
        try {
            // This is going to create how meny thereads that you want it to be.
            for(int i = 3; i > 0; i--) {
                System.out.println("Zombie Starting: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Zombie " +  threadName + " is dieing off.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

public class ZombieThread {

    public static void main(String args[]) {
        ThreadDemo T1 = new ThreadDemo( "Main Zombie");
        T1.start();

        ThreadDemo T2 = new ThreadDemo( "Assistant Zombie");
        T2.start();

        ThreadDemo T3 = new ThreadDemo( "Doctor Zombie");
        T3.start();

        ThreadDemo T4 = new ThreadDemo( "Nurse Zombie");
        T4.start();
    }
}