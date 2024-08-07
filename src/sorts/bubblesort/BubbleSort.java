package sorts.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSortAsc(int [] array) {
        //Ascending
        for(int i = array.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDesc(int [] array) {
        //Descending
        for(int i = array.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 1, 3, 5};
        bubbleSortAsc(myArray);
        System.out.println(Arrays.toString(myArray));

        bubbleSortDesc(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
