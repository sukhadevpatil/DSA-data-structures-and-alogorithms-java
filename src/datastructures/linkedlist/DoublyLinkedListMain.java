package datastructures.linkedlist;

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

        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);

        System.out.println(doublyLinkedList.get(0).value);
        System.out.println(doublyLinkedList.get(1).value);
        System.out.println(doublyLinkedList.get(5));

        System.out.println("===============================");
        doublyLinkedList.set(1, 111);
        doublyLinkedList.printList();
        System.out.println("===============================");

        doublyLinkedList.insert(1, 333);
        doublyLinkedList.printList();

        System.out.println("===============================");
        System.out.println(doublyLinkedList.remove(2).value);
        System.out.println(doublyLinkedList.remove(1).value);
        System.out.println("---------");
        doublyLinkedList.printList();
        System.out.println("===============================");

        doublyLinkedList.swapFirstLast();
        doublyLinkedList.printList();

        System.out.println("===============================");
        doublyLinkedList.append(1);
        doublyLinkedList.append(3);
        doublyLinkedList.printList();
        System.out.println("-------------");
        doublyLinkedList.reverse();

        doublyLinkedList.printList();
        System.out.println("===============================");

        System.out.println(doublyLinkedList.isPalindrome());

        System.out.println("===============================");
    }
}
