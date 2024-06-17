package datastructures.stack;

public class StackMain {

    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.getTop();
        stack.getHeight();
        stack.printStack();

        System.out.println("===================");

        stack.push(8);
        stack.push(16);
        stack.printStack();

        System.out.println("===================");

        System.out.println(stack.pop().value);
        System.out.println("-------");
        stack.printStack();

        System.out.println("===================");
    }
}
