package request;

import interfaces.IPurchaseRequest;

public class PaperBookPurchaseRequest implements IPurchaseRequest {
    public String address;
    public  PaperBookPurchaseRequest(String address){
        this.address=address;
    }
}
