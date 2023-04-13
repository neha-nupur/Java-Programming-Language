public class AbstractNonAbstractMethods {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk(); // Corrected syntax for abstract method declaration- It will not implement here, only giving idea to sub-classes/derived classes
}

class Horse extends Animal {
    void walk() { // Implementing the abstract method from Animal class - It is necessary to implement here.
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() { // Implementing the abstract method from Animal class - It is necessary to implement here.
        System.out.println("walks on 2 legs");
    }
}
