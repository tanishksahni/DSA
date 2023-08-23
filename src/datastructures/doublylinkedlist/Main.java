package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(9);
        System.out.println( myDLL.removeLast().value);
        System.out.println( myDLL.removeLast().value);
        System.out.println( myDLL.removeLast());

    }
}
