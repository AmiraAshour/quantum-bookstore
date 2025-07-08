package service;

import interfaces.IPurchaseService;
import interfaces.IPurchaseRequest;
import model.Book;

public class PurchaseService implements IPurchaseService {
    private InventoryManager inventory ;

    public PurchaseService(InventoryManager inventory) {
        this.inventory = inventory;
    }

    @Override
    public double buyBook(String isbn, int quantity, IPurchaseRequest request) {
        Book book =inventory.getBookByISBN(isbn);
        if (book == null)
            throw new IllegalArgumentException("Book not found.");
        if (!book.isPurchasable())
            throw new UnsupportedOperationException("this book cannot be purchase");
        return book.purchase(quantity,request);
    }
}
