package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceCustomExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            executorService.submit(()->{
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+"Task ="+ finalI);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        //executorService.shutdownNow();
       // executorService.shutdown();
    }
}
