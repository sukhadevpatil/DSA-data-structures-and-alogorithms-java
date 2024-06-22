package anagram;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));
    }

    public static List<List<String>> groupAnagrams(String[] inputArr) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String input : inputArr) {
            char[] chars = input.toCharArray();
            Arrays.sort(chars);
            String canonical = new String(chars);

            if (anagramGroups.containsKey(canonical)) {
                anagramGroups.get(canonical).add(input);
            } else {
                List<String> group = new ArrayList<>();
                group.add(input);
                anagramGroups.put(canonical, group);
            }
        }

        return new ArrayList<>(anagramGroups.values());
    }
}
