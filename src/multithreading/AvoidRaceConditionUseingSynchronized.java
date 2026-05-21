package multithreading;

public class AvoidRaceConditionUseingSynchronized {
    public int count = 0;

    public synchronized void increment(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        AvoidRaceConditionUseingSynchronized obj = new AvoidRaceConditionUseingSynchronized();

        Thread thread1 = new Thread(()->{
            for(int i=0;i<10;i++){
                obj.increment();
            }
        });

        Thread thread2 = new Thread(()->{
            for(int i=0;i<10;i++){
                obj.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(obj.count);

    }
}
