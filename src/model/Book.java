package model;

import interfaces.IPurchaseRequest;

public abstract class Book {
    protected String ISBN;
    protected String title;
    protected String author;
    protected int publicationYear;
    protected double price;

    public Book(String ISBN, String title, String author, int publicationYear, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public abstract boolean isPurchasable();

    public abstract double purchase(int quantity, IPurchaseRequest request);

}
