package queue;

import java.util.LinkedList;

public class practiseQuestion {
    // Check palindrome using queue and stack
    public static void main(String[] args) {
        //should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod?"));
        System.out.println(checkForPalindrome("aabbaabb ?" +
                "' , bbaabbaa"));

    }
    private static boolean checkForPalindrome(String input) {
        LinkedList<Character> queue = new LinkedList<Character>();
        LinkedList<Character> stack = new LinkedList<Character>();

        for (int i = 0; i < input.length(); i++) {
            Character ch = input.toLowerCase().charAt(i);
            if (ch >= 'a' &&
                    ch <= 'z') {
                stack.push(ch);
            }
        }
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.toLowerCase().charAt(i);
            if (ch >= 'a' &&
                    ch <= 'z') {
                queue.add(ch);
            }
        }

        return stack.
                toString().equalsIgnoreCase(queue.toString());
    }
}
