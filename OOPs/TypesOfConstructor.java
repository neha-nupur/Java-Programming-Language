public class TypesOfConstructor {
    public static void main(String args[]) {
        Student s1 = new Student(); // Non-parameterized Constructor
        Student s2 = new Student("Neha Nupur"); // Parameterized Constructor
        Student s3 = new Student(123); // Parameterized Constructor
    }
}

class Student {
    String name;
    int roll;

    Student() { // Default or Non-parameterized Constructor
        System.out.println("Non-parameterized Constructor is called...");
    }

    Student(String name) { // Parameterized Constructor
        this.name = name;
        System.out.println("Parameterized Constructor with name: " + name + " is called...");
    }

    Student(int roll) { // Parameterized Constructor
        this.roll = roll;
        System.out.println("Parameterized Constructor with roll: " + roll + " is called...");
    }
}
