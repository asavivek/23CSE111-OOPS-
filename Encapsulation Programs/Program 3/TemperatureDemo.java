public class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter for Celsius
    public double getCelsius() {
        return celsius;
    }

    // Setter for Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Read-only Fahrenheit conversion
    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    // Read-only Kelvin conversion
    public double getKelvin() {
        return celsius + 273.15;
    }
}

public class TemperatureDemo {
    public static void main(String[] args) {
        Temperature temp = new Temperature(25);
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Fahrenheit: " + temp.getFahrenheit());
        System.out.println("Kelvin: " + temp.getKelvin());

        temp.setCelsius(0);
        System.out.println("\nNew Celsius: " + temp.getCelsius());
    }
}