package thread;

public class ThreadObjUseingThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("bhati kalu ka chatu employee hai"+Thread.currentThread().getName());
        }
    }
}
