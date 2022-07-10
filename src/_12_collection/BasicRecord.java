package _12_collection;

/**
 * @author xuexuan
 * @date 2022-07-10 21:12:57
 */

record Employee(String name, int id) {
}

public class BasicRecord {
    public static void main(String[] args) {
        var bob = new Employee("Bob", 11);
        System.out.println(bob.name());
        System.out.println(bob);
    }
}
