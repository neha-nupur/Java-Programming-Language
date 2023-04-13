public class MethodOvrriding {
    public static void main(String args[]) {
        Deer d = new Deer();
        d.eat(); 
    }
}

// Base class Animal
class Animal {
    void eat() {
        System.out.println("eats anything"); // Method that can be overridden by derived classes
    }
}

// Derived class Deer, which overrides the eat() method of Animal class
class Deer extends Animal {
    void eat() {
        System.out.println("eats grass"); // Overriding method with a different implementation
    }
}
