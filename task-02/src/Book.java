public class Book {
    // Fields
    private String title;
    private String author;
    private int pages;
    private double price;
    private int year;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown author";
        this.pages = 0;
        this.price = 0.0;
        this.year = 0;
    }

    // Constructor with parameters
    public Book(String title, String author, int pages, double price, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.year = year;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to print class object info
    @Override
    public String toString() {
        return "Book {" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}