package mylab.statistics.entity;

public abstract class Publication {
    protected String title;
    protected double price;
    protected String publishDate; // "YYYYMMDD" 형식

    public Publication(String title, double price, String publishDate) {
        this.title = title;
        this.price = price;
        this.publishDate = publishDate;
    }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public String getPublishDate() { return publishDate; }
    public abstract String getPublicationType(); // 자식에서 구현
}