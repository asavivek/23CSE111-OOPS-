// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class inheriting from Animal (single inheritance)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the child class
        Dog myDog = new Dog();
        
        // Call methods from parent class
        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        
        // Call method from child class
        myDog.bark();   // Specific to Dog
    }
}