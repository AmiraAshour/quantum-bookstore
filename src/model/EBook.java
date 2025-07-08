package model;

import request.EBookPurchaseRequest;
import interfaces.IPurchaseRequest;
import service.MailService;

public class EBook extends Book{
    private String fileType;
    public EBook(String ISBN, String title, String author, int publicationYear, double price,String fileType) {
        super(ISBN, title, author, publicationYear, price);
        this.fileType=fileType;
    }

    @Override
    public boolean isPurchasable() {
        return true;
    }

    @Override
    public double purchase(int quantity, IPurchaseRequest request) {
        if (!(request instanceof EBookPurchaseRequest r))
            throw new IllegalArgumentException("Invalid request for EBook");
        MailService.send(this,r.email);
        return quantity * price;
    }

    public String getFileType() {
        return fileType;
    }
}
