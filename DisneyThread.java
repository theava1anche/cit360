package Executors;

/**
 * Created by Alexander on 3/1/2017.
 */
public class DisneyThread implements Runnable {
    private String command;

    public DisneyThread(String S){
        this.command= S;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Mickey Wave = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " Minnie Wave.");
    }
    private void processCommand(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return this.command;
    }

}
