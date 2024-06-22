package twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));
        System.out.println(Arrays.toString(twoSum(new int[]{1}, 1)));

        System.out.println(Arrays.toString(twoSum(new int[]{2, 1, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSumAnyPosition(new int[]{2, 1, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] intArr, int target) {
        int[] output = new int[0];
        if (intArr.length > 1) {
            for (int i = 1; i < intArr.length; i++) {
                if (intArr[i - 1] + intArr[i] == target) {
                    output = new int[2];
                    output[0] = i - 1;
                    output[1] = i;
                    break;
                }
            }
        }

        return output;
    }

    public static int[] twoSumAnyPosition(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int targetComplement = target - num;

            if(numMap.containsKey(targetComplement)) {
                return new int[]{numMap.get(targetComplement), i};
            }

            numMap.put(num, i);
        }
        return new int[]{};
    }
}
