package doubly_linked_list;

public class Node {
    public Node prev;
    public int data;
    public Node next;

    public Node(int data){
        this.prev = null;
        this.data = data;
        this.next = null;
    }

}
