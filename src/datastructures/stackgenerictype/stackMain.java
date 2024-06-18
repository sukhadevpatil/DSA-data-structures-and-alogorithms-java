package datastructures.stackgenerictype;

public class stackMain {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("One");
        stringStack.push("Two");
        stringStack.push("Three");

        stringStack.printStackList();

        System.out.println("====================================");

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        integerStack.printStackList();

        System.out.println("====================================");

        Stack<Character> characterStack = new Stack<>();
        characterStack.push('A');
        characterStack.push('B');
        characterStack.push('C');

        characterStack.printStackList();
        System.out.println("--------");
        System.out.println(characterStack.peek());
        System.out.println("====================================");

        characterStack.printStackList();
        System.out.println("-------------------");
        System.out.println(characterStack.pop());
        System.out.println("-------------------");
        characterStack.printStackList();

        System.out.println("====================================");

    }
}
