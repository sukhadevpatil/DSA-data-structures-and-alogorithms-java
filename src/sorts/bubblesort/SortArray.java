package sorts.bubblesort;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int [] myArray = {4,2,6,5,1,3};

        for (int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray.length - 1; j++) {
                if(myArray[j] > myArray[j+1]) {
                    int temp = myArray[j] ;
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(myArray));
    }
}
