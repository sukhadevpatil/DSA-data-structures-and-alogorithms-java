package factorial;

import java.util.Arrays;

public class FibBottomUp {

    public static int[] fib(int n) {

        int[] fibList = new int[n+1];
        fibList[0] = 0;
        fibList[1] = 1;

        for(int i = 2; i <= n; i++) {
            fibList[i] = fibList[i-1] + fibList[i-2];
        }
        return fibList;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fib(7)));
    }
}
