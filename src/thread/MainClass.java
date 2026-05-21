package thread;

public class MainClass {
    public static void main(String[] args) {
        /*ThreadObjUseingThreadClass t1 = new ThreadObjUseingThreadClass();
        ThreadObjUseingThreadClass t2 = new ThreadObjUseingThreadClass();
        t1.start();
        t2.start();*/

        /*ThreadUseingRunnableInterface taskObj = new ThreadUseingRunnableInterface();
        Thread t1 = new Thread(taskObj);
        Thread t2 = new Thread(taskObj);
        t1.start();
        t2.start();*/

        /*ThreadClassUseingIterfaceWithLoackAndSleep taskObj = new ThreadClassUseingIterfaceWithLoackAndSleep();
        Thread t1 = new Thread(new ThreadClassUseingIterfaceWithLoackAndSleep());
        Thread t2 = new Thread(new ThreadClassUseingIterfaceWithLoackAndSleep());
        t1.start();
        t2.start();*/

       /* TwoSychronizedMethodExecuteParallel taskObj = new TwoSychronizedMethodExecuteParallel();

        Thread t1 = new Thread(() -> {
            taskObj.objectLevel();
        });

        Thread t2 = new Thread(() -> {
            TwoSychronizedMethodExecuteParallel.classLevelMehod();
        });

        t1.start();
        t2.start();*/
    }
}
