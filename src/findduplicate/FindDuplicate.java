package findduplicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);
    }

    private static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> dups = new ArrayList<>();
        for(Integer i : nums) {
            if(map.containsKey(i)) {
                dups.add(i);
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        return dups;
    }
}
