public class HybridInheritance {
    public static void main(String[] args) {
        Platypus platypus = new Platypus();
        platypus.eat(); 
        platypus.breathe(); 
        platypus.walks(); 
        platypus.swim(); 
    }
}


// Base Class
class Animal {
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

// Derived Class with Hierarchical Inheritance
class Mammal extends Animal {
    void walks() {
        System.out.println("walks");
    }
}

// Derived Class with Multilevel Inheritance
class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

// Derived Class with Multiple Inheritance
class Platypus extends Mammal {
    void swim() {
        System.out.println("swim");
    }
}

