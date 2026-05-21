package singly_linked_list;

import javax.sound.midi.Soundbank;

public class SinglyLinkedList {
    Node head = null;

    public void insertAtTheBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTheEnd(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtThePositions(int positions,int data){
       if(positions <= 0){
           System.out.println("Invalid Positions number");
           return;
       }

       // create a new node with data
        Node newNode = new Node(data);

        if(positions - 1 == 0){
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 1 ; i < positions - 1; i++) {
                if(temp == null){
                    System.out.println("Invalid positions because linked list is empty ");
                    return;
                }
                temp = temp.next;
            }

            if(temp == null){
                System.out.println("Invalid positions");
                return;
            }

            newNode.next = temp.next;
            temp.next  = newNode ;
        }
    }

    public void printLinkedList(){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next ;
        }
    }

    public void deletionFromTheBeginningOperation(){
        if(head == null){
            System.out.println("LinkedList is empty");
        }
        head = head.next;
    }

    public void deletionFromTheLast(){

        if(head == null){
            System.out.println("Linked List is empty");
        }

        if(head.next == null){
            head = null;
        }

        Node temp = head , prvNode = null;
        while (temp.next != null){
            prvNode = temp ;
            temp = temp.next;
        }
        if(prvNode != null){
            prvNode.next = null;
        }
    }

    public void deletionFromTheLastV1(){

        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    public void deleteFromAtThePosition(int position){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        if(position <= 0){
            System.out.println("Please enter valid positions");
            return;
        }

        int positionIndex = position - 1;
        if(positionIndex == 0){
            head = head.next;
        }

        Node temp = head;
        for (int i = 1; i < positionIndex ; i++) {
            if(temp.next == null){
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Position out of range");
            return;
        }
        temp.next = temp.next.next;
    }


}
