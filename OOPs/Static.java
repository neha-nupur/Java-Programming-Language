public class Static {
    public static void main(String args[]) {
        Student s1 = new Student(); // Create a new instance of the Student class named s1
        s1.schoolName = "AND"; 

        Student s2 = new Student(); 
        System.out.println(s2.schoolName); // Although, it should print empty string, it will print the value of s2 = "AND" 
    }
}


class Student {
    String name; // Instance variable for name
    int roll; // Instance variable for roll

    static String schoolName; // Static variable for schoolName

    void setName(String name) { 
        this.name = name;
    }

    String getName() { 
        return this.name;
    }
}
