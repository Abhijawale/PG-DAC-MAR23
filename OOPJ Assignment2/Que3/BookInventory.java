class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    // Constructor with all fields
    public Book(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters for all fields
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Business logic methods
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity) {
        if (this.quantity < quantity) {
            throw new IllegalArgumentException("Quantity cannot be decreased below zero.");
        }
        this.quantity -= quantity;
    }

    public double getInventoryValue() {
        return price * quantity;
    }
}

public class BookInventory {
    public static void main(String[] args) {
        // Create a new Book object
        Book myBook = new Book("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", "0316769487", 1951, 8.99, 10);

        // Print the book's details
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Publisher: " + myBook.getPublisher());
        System.out.println("ISBN: " + myBook.getIsbn());
        System.out.println("Year: " + myBook.getYear());
        System.out.println("Price: $" + myBook.getPrice());
        System.out.println("Quantity: " + myBook.getQuantity());

        // Increase the quantity of the book by 5
        myBook.increaseQuantity(5);
        System.out.println("New Quantity: " + myBook.getQuantity());

        // Decrease the quantity of the book by 3
        myBook.decreaseQuantity(3);
        System.out.println("New Quantity: " + myBook.getQuantity());

        // Calculate the inventory value of the book
        double inventoryValue = myBook.getInventoryValue();
        System.out.println("Inventory Value: $" + inventoryValue);
    }
}
