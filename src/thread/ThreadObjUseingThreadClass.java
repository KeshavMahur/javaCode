package thread;

public class ThreadObjUseingThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread Object Created using thread class "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadObjUseingThreadClass t1 = new ThreadObjUseingThreadClass();
        t1.start();
    }
}
