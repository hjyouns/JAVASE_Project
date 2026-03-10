package mylab.statistics.entity;

public class Book extends Publication {
    public Book(String title, double price, String publishDate) {
        super(title, price, publishDate);
    }

    @Override
    public String getPublicationType() {
        return "Book";
    }
}