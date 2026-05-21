package thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockCustom {

    ReentrantLock lock = new ReentrantLock();

    public void task(){
        lock.lock();
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
       ReentrantLockCustom obj = new ReentrantLockCustom();
        Thread t1 = new Thread(()-> {
            obj.task();
        });


        Thread t2 = new Thread(()->{
            obj.task();
        });

        t1.start();
        t2.start();

    }
}
