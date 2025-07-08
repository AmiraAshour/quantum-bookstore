package model;

import interfaces.IPurchaseRequest;

public class ShowcaseBook extends Book{
    public ShowcaseBook(String ISBN, String title, String author, int publicationYear, double price) {
        super(ISBN, title, author, publicationYear, price);
    }

    @Override
    public boolean isPurchasable() {
        return false;
    }

    @Override
    public double purchase(int quantity, IPurchaseRequest request) {
     throw new UnsupportedOperationException("Showcase book are not for sale.");
    }
}
