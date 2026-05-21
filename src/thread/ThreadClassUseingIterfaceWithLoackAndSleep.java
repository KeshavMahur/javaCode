package thread;

public class ThreadClassUseingIterfaceWithLoackAndSleep implements Runnable {

    public static void task(){
        synchronized (ThreadClassUseingIterfaceWithLoackAndSleep.class) {

            System.out.println("Thread Name => "+Thread.currentThread().getName() + " is in sync block");

            for (int i = 0; i<3 ;i++){
                System.out.println("Thread Name => "+Thread.currentThread().getName() + " value of i => "+i);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Thread Name => "+Thread.currentThread().getName() + " is out of sync block");
        }
    }

    @Override
    public void run() {
        task();
    }
}
