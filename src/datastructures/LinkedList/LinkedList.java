package datastructures.LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
        }
    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node getHead() {
        System.out.println("Head :: " + head.value);
        return head;
    }

    public Node getTail() {
        System.out.println("Tail :: " + tail.value);
        return tail;
    }

    public int getLength() {
        System.out.println("Length :: " + length);
        return length;
    }
}
