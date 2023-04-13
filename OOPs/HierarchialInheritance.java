public class HierarchialInheritance {
    public static void main(String args[]) {
        Mammal Mansi = new Mammal();
        Mansi.eat();
        Mansi.breathe();
        Mansi.walks();
    }
}

//Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

//Derived Class
class Mammal extends Animal {
    void walks() {
        System.out.println("walks");
    }
}

// Derived Class
class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

//Derived Class
class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}