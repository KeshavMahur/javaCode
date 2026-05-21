package thread;

public class DeadLock {
     final Object lockA = new Object();
     final static Object lockB = new Object();

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        Thread t1 = new Thread(()->{
            synchronized (deadLock.lockA){
                System.out.println("Thread 1: Holding Lock A...");
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                synchronized (DeadLock.class){
                    System.out.println("Thread 1: Holding Lock B...");
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (DeadLock.class){
                System.out.println("Thread 2: Holding Lock B...");
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                synchronized (deadLock.lockA){
                    System.out.println("Thread 1: Holding Lock B...");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
