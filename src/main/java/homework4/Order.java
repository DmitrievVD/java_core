package homework4;

import java.util.ArrayList;

public class Order {
    private Buyer buyer;
    private Product product;
    private Integer quantity;

    public Order() {
        this.buyer = null;
        this.product = null;
        this.quantity = 0;
    }

    public Order(Buyer buyer, Product product, Integer quantity) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
    }



    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
