class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Default discount (10%)
    public double calculateDiscount() {
        return price * 0.10;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    // Override: Higher discount for electronics (15%)
    @Override
    public double calculateDiscount() {
        return price * 0.15;
    }
}

class Groceries extends Product {
    public Groceries(String name, double price) {
        super(name, price);
    }

    // Override: Lower discount for groceries (5%)
    @Override
    public double calculateDiscount() {
        return price * 0.05;
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        Product laptop = new Electronics("Laptop", 1000);
        Product bread = new Groceries("Bread", 5);
        Product book = new Product("Book", 20);

        laptop.display();
        System.out.println("Discount: $" + laptop.calculateDiscount());

        bread.display();
        System.out.println("Discount: $" + bread.calculateDiscount());

        book.display();
        System.out.println("Discount: $" + book.calculateDiscount());
    }
}