package singly_linked_list;

public class LinkedListPositionsOperations {
    Node head = null;

    public void insertAtThePositions(int positions,int data){
        if(positions <= 0) {
            System.out.println("Invalid Position Number Please Enter The Valid Positions Number");
            return;
        }
        Node newNode = new Node(data);
        int positionIndex = positions - 1;

        if(positionIndex == 0){
            newNode.next = head;
            head = newNode;
        }

        Node temp = head;
        for (int i = 1; i < positionIndex ; i++) {
            if(temp == null){
                System.out.println("Please valid enter valid positions number now list is empty");
            }
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Please valid enter valid positions number now list is empty");
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


}
