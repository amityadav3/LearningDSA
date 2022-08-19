package queue.QueueImplUsingArray;

public class Main {
    public static void main(String[] args) {
        Employee amit = new Employee("Amit", "Yadav", 001);
        Employee summit = new Employee("Summit", "Aggrawal", 002);
        Employee rohit = new Employee("Rohit", "Choudhary", 003);
        Employee mohit = new Employee("Mohit", "kasana", 004);

        ArrayQueue arrayQueue = new ArrayQueue(4);
        arrayQueue.add(amit);
        arrayQueue.add(summit);
        arrayQueue.add(rohit);
        arrayQueue.add(mohit);

        arrayQueue.remove();
        System.out.println(arrayQueue.peek());
        arrayQueue.printQueue();
    }
}
