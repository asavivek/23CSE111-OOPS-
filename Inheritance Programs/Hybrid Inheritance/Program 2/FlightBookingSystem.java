// Interface for booking operations
interface Bookable {
    void bookTicket();
}

// Interface for payment operations
interface Payable {
    void makePayment(double amount);
}

// Parent class for flights
class Flight {
    protected String flightNumber;
    protected String destination;

    Flight(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    void displayFlightDetails() {
        System.out.println("Flight " + flightNumber + " to " + destination);
    }
}

// Child class inheriting from Flight and implementing Bookable and Payable
class PassengerFlight extends Flight implements Bookable, Payable {
    private int seatsAvailable;
    private double ticketPrice;

    PassengerFlight(String flightNumber, String destination, int seatsAvailable, double ticketPrice) {
        super(flightNumber, destination);
        this.seatsAvailable = seatsAvailable;
        this.ticketPrice = ticketPrice;
    }

    public void bookTicket() {
        if (seatsAvailable > 0) {
            seatsAvailable--;
            System.out.println("Ticket booked for Flight " + flightNumber);
        } else {
            System.out.println("No seats available on Flight " + flightNumber);
        }
    }

    public void makePayment(double amount) {
        if (amount >= ticketPrice) {
            System.out.println("Payment of $" + amount + " successful for Flight " + flightNumber);
        } else {
            System.out.println("Insufficient payment for Flight " + flightNumber);
        }
    }

    void checkAvailability() {
        System.out.println("Seats available: " + seatsAvailable);
    }
}

// Main class to test the flight booking system
public class FlightBookingSystem {
    public static void main(String[] args) {
        PassengerFlight flight = new PassengerFlight("FL123", "New York", 2, 300.0);
        
        flight.displayFlightDetails();
        flight.checkAvailability();
        flight.bookTicket();
        flight.makePayment(350.0);
        flight.checkAvailability();
        flight.bookTicket();
        flight.bookTicket(); // Should show no seats available
    }
}