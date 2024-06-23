package factorial;

public class Factorial {
    public static void main(String[] args) {
        int myFactorial = factorial(4);
        System.out.println(myFactorial);
    }

    private static int factorial(int num) {
        if(num == 1) return 1;

        return num * factorial(num-1);
    }
}
