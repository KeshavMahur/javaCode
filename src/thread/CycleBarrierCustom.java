package thread;

import java.util.concurrent.CyclicBarrier;

public class CycleBarrierCustom {
    private void task(CyclicBarrier barrier){
        String name = Thread.currentThread().getName();
        try {
            System.out.println(name+"Start");
            Thread.sleep(1000);
            System.out.println(name+"Waiting at Pahse1");
            barrier.await();

            System.out.println(name+"Start");
            Thread.sleep(2000);
            System.out.println(name+"Waiting at Pahse2");
            barrier.await();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CycleBarrierCustom cycleBarrierCustom = new CycleBarrierCustom();
        CyclicBarrier barrier = new CyclicBarrier(2,()->{
            System.out.println("All Are chalu");
        });
        Thread t1 = new Thread(
                () -> {
                   cycleBarrierCustom.task(barrier);
                }
        );
        Thread t2 = new Thread(()->{
           cycleBarrierCustom.task(barrier);
        });
        t1.start();
        t2.start();

    }
}
