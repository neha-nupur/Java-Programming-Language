public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Neha Nupur";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 98;

        Student s2 = new Student(s1); // copy 
        s1.password = "xyz";
        s1.marks[2] = 100;
        for(int i=0; i<3; i++) {
            System.out.println(s1.marks[i] + " ");
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password; // added to copy password
        System.arraycopy(s1.marks, 0, this.marks, 0, s1.marks.length); // using arraycopy to copy marks
    }

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
