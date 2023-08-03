package datastructures.linkedlist;
public class Main {

    public static void main(String[] args) {
        // create your linked list here and perform operations
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.prepend(11);
        myLinkedList.printList();
        myLinkedList.reverse();
        myLinkedList.printList();

    }
}
