package request;

import interfaces.IPurchaseRequest;

public class EBookPurchaseRequest implements IPurchaseRequest {
    public String email;
    public EBookPurchaseRequest(String email){
        this.email=email;
    }
}
