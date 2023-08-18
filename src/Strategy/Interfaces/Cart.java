package Strategy.Interfaces;

import Strategy.Implementation.PromotionStrategy;

import java.util.List;

public interface Cart<T> {

    void addProduct(List<T> products);
    List<T> getProducts();
    double getTotal();
    double getTotalWithDiscount();
    void setPromotionStrategy(PromotionStrategy promotionStrategy);
}
