package sorts.bubblesort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[minIndex]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int temp = myArray[i];
                myArray[i] = myArray[minIndex];
                myArray[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 1, 3, 5, 4};

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
