package singly_linked_list;

public class MainSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtTheBeginning(20);
        singlyLinkedList.insertAtTheBeginning(40);
        singlyLinkedList.insertAtThePositions(2,90);
        singlyLinkedList.insertAtTheEnd(100);
        singlyLinkedList.printLinkedList();
    }
}
