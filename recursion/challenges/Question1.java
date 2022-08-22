package recursion.challenges;

//TOdo: Basic recursion practise
public class Question1 {
    public static void main(String[] args) {
        helloRecursion(10);
    }

    private static void helloRecursion(int count) {
        if(count == 0)  return;
        helloRecursion(--count);
        System.out.println(count);
    }
}
