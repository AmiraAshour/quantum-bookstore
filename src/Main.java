import model.EBook;
import model.PaperBook;
import model.ShowcaseBook;
import request.EBookPurchaseRequest;
import request.PaperBookPurchaseRequest;
import service.InventoryManager;
import service.PurchaseService;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventory=new InventoryManager();
        PurchaseService purchaseService=new PurchaseService(inventory);

        inventory.addBook(new PaperBook("ISNP1","Java","Amira",2018,100,5));
        inventory.addBook(new EBook("ISNP2","Angular","Aya",2023,60,"PDF"));
        inventory.addBook(new ShowcaseBook("ISNP3","C#","Fatma",2015,0));

        double amount1=purchaseService.buyBook("ISNP1",2,new PaperBookPurchaseRequest("1 main st"));
        System.out.println("Paid "+amount1);

        double amount2=purchaseService.buyBook("ISNP2",1,new EBookPurchaseRequest("amira@gmail.com"));
        System.out.println("Paid "+amount2);

        try {
            purchaseService.buyBook("ISNP3",1,null);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        inventory.removeOutdatedBooks(5,2025);
    }
}