public class Super {
    public static void main(String args[]) {
        Horse h = new Horse(); // Create a new instance of the Horse class named h
        System.out.println(h.color); 
    }
}


class Animal {
    String color; // Instance variable for color

   
    Animal() {
        System.out.println("animal constructor is called.");
    }
}


class Horse extends Animal {

    Horse() {
        super.color = "brown"; 
        System.out.println("horse constructor is called.");
    }
}
