package sorts.bubblesort;

import java.util.Arrays;

public class MergeArraysAndSort {
    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length) {
            if(array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }

        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }

        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }

        return combined;
    }


    public static void main(String[] args) {
        int[] array1 = {1,3,5,7,9};
        int[] array2 = {2,4,6,8,10};

        System.out.println(Arrays.toString(merge(array1, array2)));
    }
}
