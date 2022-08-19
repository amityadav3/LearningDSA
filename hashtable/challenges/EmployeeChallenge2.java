package hashtable.challenges;

import hashtable.content.Employee;

import java.util.*;

public class EmployeeChallenge2 {
    public static void main(String[] args) {
        Employee amit = new Employee("Amit", "Yadav", 001);
        Employee summit = new Employee("Summit", "Aggrawal", 002);
        Employee rohit = new Employee("Rohit", "Choudhary", 003);
        Employee mohit = new Employee("Mohit", "kasana", 004);

        List<Employee> employees = new LinkedList<Employee>();
        employees.add(amit);
        employees.add(summit);
        employees.add(rohit);
        employees.add(mohit);
        employees.add(amit);
        employees.add(summit);
        employees.add(rohit);
        employees.add(mohit);
        checkDuplicates(employees);
    }

    private static void checkDuplicates(List<Employee> employees) {
        employees.stream().forEach(el -> System.out.println(el));
        System.out.println("------");
        Map<Integer, Employee> hm = new HashMap<Integer, Employee>();
        for(Employee emp : employees){
            hm.put(hash(emp), emp);
        }
        hm.forEach((k, v) -> System.out.println(v));
    }

    private static Integer hash(Employee emp) {
        return emp.getEmployeeId();
    }
}
