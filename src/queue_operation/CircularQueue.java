package queue_operation;

public class CircularQueue {
    int data[]; // for element store
    int capacity ; // size of array declaration
    int front ; // for deletion
    int rear ; // for insertion
    int size ;

    public CircularQueue(int circularQueueSize){
        this.capacity = circularQueueSize;
        this.data = new int[this.capacity];
        this.front = 0;
        this.size = 0;
        this.rear = -1;
    }

    public void insert(int element){
        if(size == capacity){
            System.out.println("Circular queue is empty");
            return;
        }
        rear = (rear + 1) % capacity;
        this.data[rear] = element;
        size++;
    }


    public void delete(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }
        front = (front + 1) % capacity;
        size--;
    }


    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return data[front];
    }
}
