package stack.StackImplUsingLinkedlist;

public class Main {
    public static void main(String[] args) {
        Employee amit = new Employee("Amit", "Yadav", 001);
        Employee summit = new Employee("Summit", "Aggrawal", 002);
        Employee rohit = new Employee("Rohit", "Choudhary", 003);
        Employee mohit = new Employee("Mohit", "kasana", 004);

        LinkedlistStack linkedlistStack = new LinkedlistStack();
        linkedlistStack.push(amit);
        linkedlistStack.push(summit);
        linkedlistStack.push(rohit);
        linkedlistStack.push(mohit);

        linkedlistStack.printStack();
        System.out.println("----");
        System.out.println(linkedlistStack.peek());
        linkedlistStack.pop();
        System.out.println(linkedlistStack.peek());
        System.out.println(linkedlistStack.isEmpty());
        System.out.println(linkedlistStack.size());
        linkedlistStack.printStack();
    }
}
