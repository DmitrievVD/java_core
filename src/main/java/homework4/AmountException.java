package homework4;

public class AmountException extends RuntimeException {
    public AmountException(Buyer buyer, Product product, Integer quantity) {
        Main.makePurchase(buyer, product, 1);
    }

    public AmountException(String m) {
        super(m);
    }
}
