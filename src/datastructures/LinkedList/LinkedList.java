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
            length ++;
        }
    }

    public Node removeLast() {
        if(length == 0) return null;

        Node pre = head;
        Node temp = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;

        length--;

        if(length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void prepend(int val) {
        Node newNode = new Node(val);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if(length ==0) {
            tail = null;
        }

        return temp;
    }

    public Node get(int index) {

        if(index < 0 || index > length) return null;

        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
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
