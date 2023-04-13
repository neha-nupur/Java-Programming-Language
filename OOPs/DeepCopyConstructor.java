class Address {
    private String street;
    private String city;

    // Constructor
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Deep copy constructor
    public Address(Address other) {
        this.street = other.street;
        this.city = other.city;
    }

    // Getters and Setters
    // ...

    // Getter for street field
    public String getStreet() {
        return this.street;
    }

    // Setter for street field
    public void setStreet(String street) {
        this.street = street;
    }
}

class Employee {
    private String name;
    private int age;
    private Address address;

    // Constructor
    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Deep copy constructor
    public Employee(Employee other) {
        this.name = other.name;
        this.age = other.age;
        this.address = new Address(other.address); // Create a deep copy of the Address object
    }

    
    // Getter for address field
    public Address getAddress() {
        return this.address;
    }
}

public class DeepCopyConstructor {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "New York");
        Employee emp1 = new Employee("John", 30, address);
        Employee emp2 = new Employee(emp1); // Deep copy

        // Modifying the address object in emp1 will not affect emp2
        emp1.getAddress().setStreet("456 Oak St");
        System.out.println(emp1.getAddress().getStreet()); // Output: 456 Oak St
        System.out.println(emp2.getAddress().getStreet()); // Output: 123 Main St
    }
}
