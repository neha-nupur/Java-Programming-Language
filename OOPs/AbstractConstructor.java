public class AbstractConstructor {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color); // Output: brown
    }
}

// Base or Parent
abstract class Animal{
    String color;

    Animal() {     // Parent constructor
        color = "brown"; 
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

//Derived or child
class Horse extends Animal{
    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs.");
    }
}
