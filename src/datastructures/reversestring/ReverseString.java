package datastructures.reversestring;

import datastructures.stackgenerictype.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println("===========");
        System.out.println(reversedString);
        System.out.println("===========");
    }

    private static String reverseString(String myString) {
        char [] ch = myString.toCharArray();

        String output = "";
        for(int i = ch.length-1; i >= 0; i--) {
            output += ch[i];
        }
        return output;
    }
}
