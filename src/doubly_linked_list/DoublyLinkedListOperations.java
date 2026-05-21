package doubly_linked_list;
public class DoublyLinkedListOperations {
    public Node head ;
    public Node tail;

    public void insertAtTheBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtTheEnd(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteFromTheBeginning(){
        if(head == tail){
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void delteFromTheEnd(){
        if(tail == null){
            System.out.println("List is Empty");
            return;
        }

        if(head == tail){
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    public void displayBackward(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public void displayForward(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void backWardWithRecursion(Node tail){
        if(tail == null){
            return;
        }
        System.out.println(tail.data);
        backWardWithRecursion(tail.prev);
    }

    public void insertAtThePositions (int position , int data){
        if(position <= 0 ){
            System.out.println("Please enter valid positions");
            return;
        }
        Node newNode = new Node(data);
        if(position == 1){
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        if (head == null) {
            System.out.println("Invalid position");
            return;
        }

        Node temp = head;
        for (int i = 1; i < position -1; i++) {
            if(temp == null){
                System.out.println("Please enter valid position list is empty");
                return;
            }
            temp = temp.next;
        }

        newNode.next =  temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp = newNode;
    }

}