package Strategy.Entities;

import Strategy.Implementation.PromotionStrategy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Strategy.Interfaces.Cart<Product> {
    List<Product> productList = new ArrayList<Product>();
    private PromotionStrategy promotionStrategy = new PromotionStrategy<Product>();
    private LocalDate dateCreated = null;

    public Cart(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public void addProduct(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            productList.add(products.get(i));
        }
    }

    @Override
    public List<Product> getProducts() {
        return this.productList;
    }

    @Override
    public double getTotal() {
        double total = 0;

        for (int i = 0; i < productList.size(); i++) {
            total = total + productList.get(i).value;
        }

        return total;
    }

    @Override
    public double getTotalWithDiscount() {
        return this.promotionStrategy.getDiscount(this);
    }

    public void setPromotionStrategy(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}
