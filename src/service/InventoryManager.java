package service;

import interfaces.IInventoryManager;
import model.Book;

import java.util.*;

public class InventoryManager implements IInventoryManager {
    private Map<String, Book> inventory = new HashMap<>();

    @Override
    public void addBook(Book book) {
        inventory.put(book.getISBN(), book);
        System.out.println("Added " + book.getTitle());
    }

    @Override
    public List<Book> removeOutdatedBooks(int maxAge, int currentYear) {
        List<Book> removed = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> it = inventory.entrySet().iterator();
        while (it.hasNext()) {
            Book book = it.next().getValue();
            if (currentYear - book.getPublicationYear() > maxAge) {
                removed.add(book);
                it.remove();
                System.out.println("Removed outdated " + book.getTitle());
            }
        }
        return removed;
    }

    @Override
    public Book getBookByISBN(String isbn) {
        return inventory.get(isbn);
    }
}
