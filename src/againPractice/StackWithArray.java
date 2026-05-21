package againPractice;

public class StackWithArray {
    char array[];
    int capacity;
    int top ;

    public StackWithArray(int sizeOfArray){
        this.capacity = sizeOfArray;
        this.array = new char[this.capacity];
        this.top = -1;
    }

    public boolean isEmpty(){
        return top == -1 ;
    }

    public boolean isFull(){
        return top == this.capacity - 1;
    }

    public void push(char elements){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        this.array[++top] = elements;
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return ' ';
        }
        return this.array[top--];
    }

    public void pushStringInStack(String orignalString){
        int index = 0;
        while (index < orignalString.length()){
            push(orignalString.charAt(index));
            index++;
        }
    }

    public void reverseStringInStack(){
      StringBuilder stringBuilder = new StringBuilder();
      while (!isEmpty()){
            stringBuilder.append(pop());
      }
        System.out.println(stringBuilder);
    }

    boolean isStringBalanced(String testing){
        char charArray[] = testing.toCharArray();

        for (int i = 0 ;i < charArray.length ; i++){

            char ch = charArray[i];

            if( ch == '{' || ch == '[' || ch == '('){
                push(ch);
            }
            else if(ch == '}' || ch == ']' || ch == ')'){
                if(isEmpty()){
                    return  false;
                }
                char popCh = pop();
                if((ch == '}' && popCh != '{') || (ch == ']' && popCh != '[') || (ch == ')' && popCh != '(' ) )
                    return false;
            }
        }

        return isEmpty();
    }
}
