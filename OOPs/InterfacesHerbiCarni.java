public class InterfacesHerbiCarni {
    public static void main(String[] args) {
        Bear b = new Bear(); // Create a new instance of the Bear class
        b.eatMeat(); // Call the eatPlants() method on the Bear instance
    }
}

// Interface defining the behavior of a herbivore
interface Herbivore {
    void eatPlants(); 
}

// Interface defining the behavior of a carnivore
interface Carnivore {
    void eatMeat(); 
}


class Bear implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Bear eats plants."); 
    }

    public void eatMeat() {
        System.out.println("Bear eats meat."); 
    }
}
