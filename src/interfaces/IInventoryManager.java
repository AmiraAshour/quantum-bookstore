package interfaces;

import model.Book;

import java.util.List;

public interface IInventoryManager {
    void addBook(Book book);

    List<Book> removeOutdatedBooks(int maxAge, int currentYear);

    Book getBookByISBN(String isbn);
}
