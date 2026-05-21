package circular_linked_list;

public class CircularLinkedListOperations {
    public Node head = null;
    public Node tail = null;

    public void addFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            tail.next = head;
            head.prev = tail;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        head.prev = tail;
        tail.next = head;
    }
}

