package hashtable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + " : ");
            Node temp = dataMap[i];

            while (temp != null) {
                System.out.println("{ " + temp.key + " = " + temp.value + " }");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;

        char [] keyChars = key.toCharArray();

        for(int i = 0; i < keyChars.length; i++) {
            hash = (hash + (keyChars[i] * 23)) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int bucketIndex = hash(key);

        Node newNode = new Node(key, value);
        Node temp = dataMap[bucketIndex];
        if(temp == null) {
            dataMap[bucketIndex] = newNode;
        } else {
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);

        Node temp = dataMap[index];

        while (temp != null) {
            if(Objects.equals(temp.key, key)) return temp.value;

            temp = temp.next;
        }
        return 0;
    }

    public List<String> keys() {
        List<String> keys = new ArrayList<>();
        for (Node node : dataMap) {
            Node temp = node;
            while (temp != null) {
                keys.add(temp.key);
                temp = temp.next;
            }
        }
        return keys;
    }


}
