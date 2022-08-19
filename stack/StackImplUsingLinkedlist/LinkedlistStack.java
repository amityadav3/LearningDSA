package stack.StackImplUsingLinkedlist;

import java.util.LinkedList;

public class LinkedlistStack {
    private LinkedList<Employee> stack;

    public LinkedlistStack(){
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.size() == 0;
    }

    public void printStack(){
        stack.stream().forEach(System.out::println);
    }
}
