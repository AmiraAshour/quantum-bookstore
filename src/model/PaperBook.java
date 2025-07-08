package model;

import request.PaperBookPurchaseRequest;
import interfaces.IPurchaseRequest;
import service.ShippingService;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String ISBN, String title, String author, int publicationYear, double price, int stock) {
        super(ISBN, title, author, publicationYear, price);
        this.stock = stock;
    }

    @Override
    public boolean isPurchasable() {
        return true;
    }

    @Override
    public double purchase(int quantity, IPurchaseRequest request) {
        if (!(request instanceof PaperBookPurchaseRequest r))
            throw new IllegalArgumentException("Invalid request for PaperBook");
        if (quantity > stock)
            throw new IllegalArgumentException("Not enough stock");
        stock -= quantity;
        ShippingService.send(this, r.address);
        return quantity * price;
    }

}
