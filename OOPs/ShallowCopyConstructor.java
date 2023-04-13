class Employee {
    private String name;
    private int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Shallow copy constructor
    public Employee(Employee other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getters and Setters
    // ...

    // Getter for name field
    public String getName() {
        return this.name;
    }

    // Setter for name field
    public void setName(String name) {
        this.name = name;
    }
}

public class ShallowCopyConstructor {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 30);
        Employee emp2 = new Employee(emp1); // Shallow copy

        // Both emp1 and emp2 refer to the same underlying objects
        System.out.println(emp1.getName()); // Output: John
        System.out.println(emp2.getName()); // Output: John

        // Modifying the shared object will affect both emp1 and emp2
        emp1.setName("Jane");
        System.out.println(emp1.getName()); // Output: Jane
        System.out.println(emp2.getName()); // Output: Jane
    }
}
