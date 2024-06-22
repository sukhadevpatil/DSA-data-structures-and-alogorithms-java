package nonrepeatingchar;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
    }

    private static Character firstNonRepeatingChar(String input) {
        Map<Character, Integer> charCount = new HashMap<>();

        for(char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for(char c : input.toCharArray()) {
            if(charCount.get(c) == 1)
                return c;
        }
        return null;
    }
}
