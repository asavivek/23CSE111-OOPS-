// Base class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    String speak() {
        return "Animal sound";
    }
}

// Derived class
class Mammal extends Animal {
    String furColor;

    Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    String getFurColor() {
        return furColor;
    }
}

// Further derived class
class Dog extends Mammal {
    String breed;

    Dog(String name, String furColor, String breed) {
        super(name, furColor);
        this.breed = breed;
    }

    String getBreed() {
        return breed;
    }
}

// Main class to test the hierarchy
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Brown", "Golden Retriever");
        System.out.println("Name: " + dog.name + ", Fur Color: " + dog.getFurColor() + ", Breed: " + dog.getBreed());
        System.out.println(dog.speak()); // Calling the speak method from the Animal class
    }
}