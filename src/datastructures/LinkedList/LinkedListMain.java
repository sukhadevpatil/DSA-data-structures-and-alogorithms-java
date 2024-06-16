package datastructures.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(2);
        linkedList.append(1);

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        linkedList.printList();

        //Remove last item 4
        System.out.println(linkedList.removeLast().value);

        //Remove last item 2
        System.out.println(linkedList.removeLast().value);

        //Remove last item 1
        System.out.println(linkedList.removeLast().value);

        //null value
        System.out.println(linkedList.removeLast());

        System.out.println("=======================");
        linkedList.prepend(1);
        linkedList.prepend(2);

        linkedList.printList();
        System.out.println("=======================");

        //linkedList.printList();

        // Removed 1st element
        System.out.println(linkedList.removeFirst().value);

        // Removed 2nd element
        System.out.println(linkedList.removeFirst().value);

        //removes last element
        System.out.println(linkedList.removeFirst());

        System.out.println("==========================");
        //linkedList.printList();
        linkedList.prepend(33);
        linkedList.prepend(44);
        linkedList.prepend(55);
        linkedList.printList();
        System.out.println("=-------------------=");
        System.out.println(linkedList.get(1).value);
        System.out.println(linkedList.get(0).value);
        System.out.println(linkedList.get(2).value);
    }
}
