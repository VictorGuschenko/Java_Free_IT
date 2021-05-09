package library;

public class LibraryRunner {

    public static void main(String[] args) {

        Thread thread = new SimpleThread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        try {
            thread.join();
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
    }
}
