package gr.aueb.cf.java.ch16.threads;

public class WorkerThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 2_000_000_000; i++) {
            if (i == 2_000_000_000) {
                System.out.println("Worker Thread " + (double)i);
                break;
            }
        }
    }
}
