package queue_operation;

public class DoubleEndedQueue {
    int arrayOfData[];
    int capacityOfArray ;
    int front ;
    int rear ;
    int size ;

    public DoubleEndedQueue(int capacity){
        this.capacityOfArray = capacity;
        this.arrayOfData = new int[this.capacityOfArray];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }


    public boolean isFull(){
        return size == capacityOfArray;
    }

    public void insertAtFront(int element ){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
    }

}
