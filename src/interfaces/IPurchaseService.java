package interfaces;

public interface IPurchaseService {
    double buyBook(String isbn , int quantity , IPurchaseRequest request);
}
