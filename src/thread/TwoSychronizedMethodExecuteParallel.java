package thread;

public class TwoSychronizedMethodExecuteParallel {

    public static synchronized void classLevelMehod(){
        for (int i = 0; i<3 ;i++){
            System.out.println("Thread Name => "+Thread.currentThread().getName() + " value of i => "+i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void  objectLevel(){
        for (int i = 0; i<3 ;i++){
            System.out.println("Thread Name => "+Thread.currentThread().getName() + " value of i => "+i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
