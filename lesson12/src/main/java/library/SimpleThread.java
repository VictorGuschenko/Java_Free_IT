package library;

public class SimpleThread extends Thread{
    @Override
    public void run() {
        try {

            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
