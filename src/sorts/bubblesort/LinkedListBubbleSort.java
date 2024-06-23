package sorts.bubblesort;

public class LinkedListBubbleSort {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListBubbleSort(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
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
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // WRITE BUBBLESORT METHOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////

    void bubbleSort() {
        if (this.length < 2) return;

        Node sortedUntil = null;
        while (sortedUntil != this.head.next) {
            Node current = this.head;
            while (current.next != sortedUntil) {
                Node nextNode = current.next;
                if (current.value > nextNode.value) {
                    int temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;
                }
                current = current.next;
            }
            sortedUntil = current;
        }
    }

    public static void main(String[] args) {
        LinkedListBubbleSort bubbleSort = new LinkedListBubbleSort(9);
        bubbleSort.append(10);
        bubbleSort.append(1);
        bubbleSort.append(6);
        bubbleSort.append(5);
        bubbleSort.append(3);
        bubbleSort.append(2);
        bubbleSort.append(4);
        bubbleSort.append(7);
        bubbleSort.append(8);

        bubbleSort.printList();
        System.out.println("================");
        bubbleSort.bubbleSort();
        bubbleSort.printList();
        System.out.println("================");
    }

}
