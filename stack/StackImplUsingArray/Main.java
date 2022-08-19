package stack.StackImplUsingArray;

public class Main {
    public static void main(String[] args) {
        Employee amit = new Employee("Amit", "Yadav", 001);
        Employee summit = new Employee("Summit", "Aggrawal", 002);
        Employee rohit = new Employee("Rohit", "Choudhary", 003);
        Employee mohit = new Employee("Mohit", "kasana", 004);

        ArrayStack arrayStack = new ArrayStack(4);

        arrayStack.push(amit);
        arrayStack.push(summit);
        arrayStack.push(rohit);
        arrayStack.push(mohit);

        arrayStack.pop();
        arrayStack.push(summit);
        arrayStack.push(summit);
        arrayStack.printStack();
        arrayStack.pop();
        System.out.println(arrayStack.size());
        System.out.println(arrayStack.peek());
    }
}
