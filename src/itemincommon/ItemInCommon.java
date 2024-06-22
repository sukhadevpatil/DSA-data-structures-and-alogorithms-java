package itemincommon;

import java.util.HashMap;
import java.util.Map;

public class ItemInCommon {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        int [] arr2 = {4, 5, 3};
        System.out.println(itemInCommon(arr1, arr2));
    }

    private static boolean itemInCommon(int[] arr1, int[] arr2) {
        Map<Integer, Boolean> integerMap = new HashMap<>();

        for(Integer i : arr1) {
            integerMap.put(i, true);
        }

        for(int j : arr2) {
            if(integerMap.get(j) != null) return true;
        }
        return false;
    }
}
