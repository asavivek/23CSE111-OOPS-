package citymanagement;

import java.util.Scanner;

public class City {
    private String cityname;
    private int population;
    private double budget;
    private int powersupply;
    private int watersupply;

    public City(String cityname) {
        this.cityname = cityname;
        this.population = 10000;
        this.budget = 500000.0;
        this.powersupply = 1000;
        this.watersupply = 800;
    }

    public void increasepopulation(int amount) {
        population += amount;
        budget -= amount * 50;
    }

    public void decreasepopulation(int amount) {
        population -= amount;
        if (population < 0) population = 0;
    }

    public void adjustbudget(double amount) {
        budget += amount;
    }

    public void buildpowerplant(int capacity) {
        powersupply += capacity;
        budget -= capacity * 1000;
    }

    public void buildwaterfacility(int capacity) {
        watersupply += capacity;
        budget -= capacity * 800;
    }

    public String getcitystats() {
        return cityname + " - Pop: " + population + ", Budget: $" + budget + ", Power: " + powersupply + ", Water: " + watersupply;
    }

    public void collecttaxes(double rate) {
        budget += population * rate;
    }

    public void repairinfrastructure(int cost) {
        budget -= cost;
        powersupply += 50;
        watersupply += 40;
    }

    public void simulateday(Scanner scanner) {
        System.out.println("Enter population growth: ");
        increasepopulation(scanner.nextInt());
        System.out.println("Enter tax rate: ");
        collecttaxes(scanner.nextDouble());
    }

    public boolean issustainable() {
        return budget > 0 && powersupply > population / 10 && watersupply > population / 15;
    }

    public void expandcity(int newpop, int newpower, int newwater) {
        population += newpop;
        powersupply += newpower;
        watersupply += newwater;
        budget -= (newpop * 50 + newpower * 1000 + newwater * 800);
    }

    // Added main method to test the City class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name: ");
        String name = scanner.nextLine();
        City city = new City(name);
        city.simulateday(scanner);
        System.out.println(city.getcitystats());
        scanner.close();
    }
}