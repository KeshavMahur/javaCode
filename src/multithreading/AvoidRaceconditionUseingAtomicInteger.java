package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AvoidRaceconditionUseingAtomicInteger {
    AtomicInteger ai = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        AvoidRaceconditionUseingAtomicInteger obj = new AvoidRaceconditionUseingAtomicInteger();
        Thread t1  = new Thread(
                () -> {
                    String name =   Thread.currentThread().getName();
                    System.out.println(name + " start");
                    for (int i = 0; i < 10; i++) {
                        obj.ai.incrementAndGet();
                    }
                    System.out.println(name + " end");
                }
        );
        Thread t2  = new Thread(()->{
            String name =   Thread.currentThread().getName();
            System.out.println(name + " start");
            for (int i = 0; i <10; i++) {
                obj.ai.incrementAndGet();
            }
            System.out.println(name + " end");
        });
        System.out.println(Thread.currentThread().getName()+"Start");
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.ai.get());
        System.out.println(Thread.currentThread().getName()+"End");

    }
}
