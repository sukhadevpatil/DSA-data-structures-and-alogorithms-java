package hashtable;

public class HashTableMain {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.set("abc", 123);
        hashTable.set("xyz", 789);
        hashTable.printTable();

        System.out.println("=======================");

        hashTable.set("nails", 1000);
        hashTable.set("tile", 2000);
        hashTable.set("lumber", 3000);

        hashTable.set("bolts", 500);
        hashTable.set("screw", 300);
        hashTable.printTable();

        System.out.println("============================");

        System.out.println(hashTable.get("nails"));
        System.out.println(hashTable.get("lumber"));

        System.out.println("===========================");

        System.out.println(hashTable.keys());

        System.out.println("===========================");
    }
}
