package hashtable.content;
import java.util.HashMap;
import java.util.Map;

public class PractiseMap {
    public static void main(String[] args) {

        Employee amit = new Employee("Amit", "Yadav", 001);
        Employee summit = new Employee("Summit", "Aggrawal", 002);
        Employee rohit = new Employee("Rohit", "Choudhary", 003);
        Employee mohit = new Employee("Mohit", "kasana", 004);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        //hashMap.put("amit",amit);
        hashMap.put("summit",summit);
        hashMap.put("rohit", rohit);
        hashMap.put("mohit", mohit);
        hashMap.putIfAbsent("amit",amit);

        hashMap.forEach((k, v) -> System.out.println("Key= " + k + "    " + " Value= " + v));
    }
}
