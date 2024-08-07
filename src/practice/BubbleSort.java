package practice;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9, 3, 6, 5, 2, 8, 1, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
