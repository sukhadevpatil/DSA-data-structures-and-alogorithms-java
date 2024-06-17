package datastructures.LinkedList;

public class DoublyLinkedListMain {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);

        doublyLinkedList.printList();
        System.out.println("================================");
        doublyLinkedList.append(10);
        doublyLinkedList.printList();
        System.out.println("================================");

        System.out.println(doublyLinkedList.removeLast().value);
        System.out.println(doublyLinkedList.removeLast().value);
        System.out.println(doublyLinkedList.removeLast());

        doublyLinkedList.printList();
        System.out.println("===============================");

        doublyLinkedList.append(21);

        doublyLinkedList.prepend(4);
        doublyLinkedList.printList();
        System.out.println("===============================");

        System.out.println(doublyLinkedList.removeFirst().value);
        System.out.println(doublyLinkedList.removeFirst().value);
        System.out.println(doublyLinkedList.removeFirst());
        doublyLinkedList.printList();

        System.out.println("===============================");

    }
}
