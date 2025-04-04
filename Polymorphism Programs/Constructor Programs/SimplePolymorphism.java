class Animal {
    String name;

    Animal() {
        name = "Unknown";
        System.out.println("Default Animal constructor called");
    }

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor with name: " + name + " called");
    }

    void sound() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Default Dog constructor called");
    }

    Dog(String name) {
        super(name);
        System.out.println("Dog constructor with name: " + name + " called");
    }

    void sound() {
        System.out.println(name + " barks");
    }
}

public class SimplePolymorphism {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal("Cat");
        Dog d1 = new Dog();
        Dog d2 = new Dog("Rex");

        System.out.println("\nTesting sounds:");
        a1.sound();
        a2.sound();
        d1.sound();
        d2.sound();

        System.out.println("\nPolymorphic reference:");
        Animal ref = new Dog("Max");
        ref.sound();
    }
}