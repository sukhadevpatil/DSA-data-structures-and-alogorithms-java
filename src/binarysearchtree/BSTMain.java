package binarysearchtree;

public class BSTMain {

    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        System.out.println(myBST.root);

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);

        System.out.println(myBST.root.left.right.value);
        System.out.println("===============================");
        myBST.insert(10);
        System.out.println(myBST.root.left.left.left.value);
        myBST.insert(19);
        System.out.println(myBST.root.left.left.right.value);

        System.out.println("==================================");

        System.out.println(myBST.contains(27));
        System.out.println(myBST.contains(17));

        System.out.println("==================================");
    }
}
