package recursion.challenges;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Question2 {
    static int n1 = 0, n2 = 1, sum = 0, index = 0, indexForBacktracking = 0;
    static int[] newArray = new int[5];
    static int[] newArrayForBacktracking = new int[5];
    static StringBuilder sb = new StringBuilder();
    private static char aChar;

    public static void main(String[] args) {
        //Todo: Factorial of a number using recursion
        System.out.println(factorial(5));
        //Todo: Fibonacci series using recursion
        System.out.print(n1 + ", " + n2 + ", ");
        fibonacci(10);
        System.out.println();
        //Todo: Print name n times from 1 to 10 backtracking
        printNameNTimes(10);
        //Todo: Print name n times from 10 to 1 using backtracking
        printNameNTimesBackward(10);
        //Todo: reverse an array using recursion
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        reverseArray(arr,n-1);
        Arrays.stream(newArray).forEach(System.out::print);
        //Todo: reverse an array using backtracking
        reverseArrayUsingBacktracking(arr, 0);
        System.out.println();
        Arrays.stream(newArrayForBacktracking).forEach(System.out::print);
        //Todo: Reverse a string
        System.out.println();
        String input = "Amit";
        reverseString(input,0);
        System.out.println(sb.toString());
    }

    private static void reverseString(String input, int count) {
        if(count == input.length())    return;
        reverseString(input, count+1);
        sb.append(input.charAt(count));
    }

    private static void reverseArrayUsingBacktracking(int[] arr, int i) {
        if(i == arr.length)   return;
        reverseArrayUsingBacktracking(arr, i+1);
        newArrayForBacktracking[indexForBacktracking++] = arr[i];
    }

    private static void reverseArray(int [] arr, int i) {
        if(i < 0) return;
        newArray[index++] = arr[i];
        reverseArray(arr, --i);
    }

    private static void printNameNTimesBackward(int n) {
        if(n == 0)  return;
        System.out.println(n+" Amit");
        printNameNTimesBackward(n-1);
    }

    private static void printNameNTimes(int n) {
        if(n==0)    return;
        printNameNTimes(n-1);
        System.out.println(n+" Amit");
    }

    //Concept : 0 1 1 2 3 5 8 13
    private static void fibonacci(int n) {
        if(n == 0)  return;
        sum = n1 + n2;
        n1 = n2;
        n2 = sum;
        System.out.print(sum+", ");
        fibonacci(n-1);
    }

    private static int factorial(int n) {
        if(n == 0 || n==1)  return 1;
        return n * factorial(n -1);
    }
}
