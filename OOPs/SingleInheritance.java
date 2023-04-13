public class SingleInheritance {
    public static void main(String arg[]) {
        Fish shark = new Fish();
        shark.eat();
    }
}


//Base class 
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

//Derived class
class Fish extends Animal {    // extends draws previous class features
    int fins;

    void swim() {
        System.out.println("Swims in water.");
    }
}
