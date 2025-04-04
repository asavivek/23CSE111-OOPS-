abstract class Vehicle {
    abstract void start();
    abstract void stop();
    
    void honk() {
        System.out.println("Honking!");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started with a key.");
    }

    void stop() {
        System.out.println("Car stopped.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started with a kick.");
    }

    void stop() {
        System.out.println("Bike stopped.");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        bike.start();
        car.honk();
    }
}