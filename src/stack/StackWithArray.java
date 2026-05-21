package stack;

public class StackWithArray {
    private int array[];
    private int maxSizedOfStack;
    private int top = -1; // because first when stack is
                            // create with empty stack when element are insert it will increase

    public StackWithArray(int size){
        this.maxSizedOfStack = size;
        this.array = new int[maxSizedOfStack];
    }

    public boolean push(int data){
        if(isFull()){
            System.out.println("Stack memory out of range");
            return false;
        }
        array[++top] = data;
        return true;
    }

    public void displayElements(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public boolean pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return false;
        }
        // decrease top
        System.out.println("Delete element from stack => "+ array[top--]);
        return true;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
      return top == maxSizedOfStack-1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }

        return array[top];
    }
}
