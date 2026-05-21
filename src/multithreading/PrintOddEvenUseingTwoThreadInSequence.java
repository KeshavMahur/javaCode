package multithreading;

public class PrintOddEvenUseingTwoThreadInSequence {
    private int start = 0;
    private final int max = 10;


    public synchronized void printOdd() throws InterruptedException {
        while (start <= max){
            if(start % 2 == 0){
                wait();
            }
            if(start <=max){
                System.out.println(Thread.currentThread().getName()+" => " + start);
                start++;
                notify();
            }
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while(start <= max){
            if(start % 2 != 0){
                wait();
            }
            if(start <= max){
                System.out.println(Thread.currentThread().getName()+" => " +start);
                start++;
                notify();
            }
        }
    }


    public static void main(String[] args) {
        PrintOddEvenUseingTwoThreadInSequence obj = new PrintOddEvenUseingTwoThreadInSequence();

        Thread even = new Thread(()->{
            try {

                obj.printEven();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"even");

        Thread odd = new Thread(()->{
            try {
                obj.printOdd();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        },"odd");

        even.start();
        odd.start();
    }
}
