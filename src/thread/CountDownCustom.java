package thread;

import java.util.concurrent.CountDownLatch;

public class CountDownCustom  {

    private void task(CountDownLatch countDownLatch) {
        System.out.println(Thread.currentThread().getName()+"Strart");
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"End");
        countDownLatch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread start");
        CountDownCustom countDownCustom = new CountDownCustom();
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Thread t1 = new Thread( () ->{
            System.out.println("Db Connet");
            countDownCustom.task(countDownLatch);
        });
        Thread t2 = new Thread( () ->{
            System.out.println("task 2");
            countDownCustom.task(countDownLatch);
        });
        Thread t3 = new Thread( () ->{
            System.out.println("task 3");
            countDownCustom.task(countDownLatch);
        });
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread waiting...");

        countDownLatch.await(); // yaha wait karega

        System.out.println("All tasks completed");
    }
}
