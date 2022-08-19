package stack;

import java.util.LinkedList;
import java.util.Stack;

public class practiseQuestions {
    //check palindrome using stack
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

        System.out.println("-------------------");

        //should return true
        System.out.println(checkForPalindromeUsingEquals("abccba"));
        // should return true
        System.out.println(checkForPalindromeUsingEquals("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindromeUsingEquals("I did, did I?"));
        // should return false
        System.out.println(checkForPalindromeUsingEquals("hello"));
        // should return true
        System.out.println(checkForPalindromeUsingEquals("Don't nod?"));
        System.out.println(checkForPalindromeUsingEquals("aabbaabb ?" +
                "' , bbaabbaa"));
    }
    private static boolean checkForPalindromeUsingEquals(String input) {
        StringBuilder original = new StringBuilder();
        StringBuilder reversed = new StringBuilder();
        LinkedList<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.toLowerCase().charAt(i);
            if (ch >= 'a' &&
                    ch <= 'z') {
                original.append(ch);
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            Character ch = stack.pop();
            reversed.append(ch);
        }
        return original.
                toString().equalsIgnoreCase(reversed.toString());
    }
    private static boolean checkForPalindrome(String input) {
        StringBuilder sb = new StringBuilder();
        LinkedList<Character> stack = new LinkedList<Character>();
        for(int i =0;i<input.length();i++){
            if(!(input.toLowerCase().charAt(i)==' ' ||
                    input.toLowerCase().charAt(i)=='?' ||
                    input.toLowerCase().charAt(i)==',' ||
                    input.toLowerCase().charAt(i)=='\'')){

                sb.append(input.toLowerCase().charAt(i));

            }
        }
        String inp = sb.toString();
        int l = inp.length();
        int maxLength = 0;
        if(l%2==0)  maxLength = l/2;
        else maxLength = l/2-1;

        for(int i =0; i<maxLength; i++) {
            stack.push(inp.charAt(i));
        }

        for(int i = maxLength; i<l; i++) {
            if(stack.isEmpty()) return false;
            char ch = (char) stack.peek();
                if (ch == inp.charAt(i))
                    stack.pop();
            }

        if(stack.size() == 0)   return true;
        else return false;
    }
}
