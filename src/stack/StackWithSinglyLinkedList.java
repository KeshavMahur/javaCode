package stack;

public class StackWithSinglyLinkedList {

    public Node top ;

    public StackWithSinglyLinkedList(){
        this.top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public boolean push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        return true;
    }

    public boolean pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return false;
        }
        top = top.next;
        return true;
    }

    public int peek(){
       if(isEmpty()){
           System.out.println("Stack is empty ");
           return -1;
       }

       return top.data;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


}

