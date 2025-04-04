abstract class Animal {
    abstract void makeSound();
    abstract void move();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark!");
    }

    void move() {
        System.out.println("Running on four legs.");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Chirp!");
    }

    void move() {
        System.out.println("Flying in the sky.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        dog.makeSound();
        dog.move();
        bird.makeSound();
        bird.move();
    }
}