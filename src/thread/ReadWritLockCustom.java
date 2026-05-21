package thread;

import java.util.HashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static java.lang.Thread.sleep;

public class ReadWritLockCustom {
    private final HashMap<Integer,String> map = new HashMap<>();
    private final ReadWriteLock readWritLock  = new ReentrantReadWriteLock();

    public void write(int key, String value){

        readWritLock.writeLock().lock();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" Write are lock");
        try{
            System.out.println(threadName
                    + " writing...");
            Thread.sleep(1000);
            map.put(key,value);
            System.out.println(threadName+" Write are succes");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            readWritLock.writeLock().unlock();
            System.out.println(threadName+" Write are unlock");
        }
    }

    public String read(int key){
        readWritLock.readLock().lock();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" Read are lock");
        try {
            System.out.println(threadName
                    + " reading...");
            Thread.sleep(1000);
            return map.get(key);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            readWritLock.readLock().unlock();
            System.out.println(threadName+" Read are unlock");
        }
    }

    public static void main(String[] args) {
        ReadWritLockCustom readWriteLock = new ReadWritLockCustom();
        Thread t1 = new Thread(()->{
            readWriteLock.write(0,"a");
        });
        Thread t2 = new Thread(()->{
            readWriteLock.write(1,"b");
        });

        Thread t3 = new Thread(()->{
            readWriteLock.read(0);
        });

        Thread t4 = new Thread(()->{
            readWriteLock.read(1);
        });

    /*    t1.start();
        t2.start();*/

        t3.start();

        t4.start();
    }
}
