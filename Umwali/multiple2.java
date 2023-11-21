// Interface representing the common behavior for all animals
interface Animal {
    void speak();
}

// Interface for mammals
interface Mammal extends Animal {
    void giveBirth();
}

// Interface for birds
interface Bird extends Animal {
    void layEggs();
}

// Class implementing both Mammal and Bird interfaces, achieving "multiple inheritance"
class multiple2 {
    @Override
    public void speak() {
        System.out.println("Platypus says quack");
    }

    @Override
    public void giveBirth() {
        System.out.println("Platypus gives birth to live young");
    }

    @Override
    public void layEggs() {
        System.out.println("Platypus lays eggs");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Platypus perry = new Platypus();
        perry.speak();      // Inherited from Animal
        perry.giveBirth();  // Inherited from Mammal
        perry.layEggs();    // Inherited from Bird
    }
}
