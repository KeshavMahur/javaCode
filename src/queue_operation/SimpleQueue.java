package queue_operation;

public class SimpleQueue {

    int data[];
    int capacity;
    int front ;
    int rear ;

    public SimpleQueue(int queueSize) {
        this.capacity = queueSize;
        this.data = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }

    public void insertInQueue(int data){
        if(rear == capacity - 1){
            System.out.println("Queue is full");
            return;
        }

        rear++;
        this.data[rear] = data;
    }

    public void deleteFromQueue(){
        if(front > rear){
            System.out.println("Queue is empty now");
            return;
        }
        front ++;
    }

}

