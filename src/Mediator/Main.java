package Mediator;

import Mediator.auxiliarClasses.Products;
import Mediator.mediator.Mediator;
import Mediator.mediatorClasses.Buyer.Buyer;
import Mediator.mediatorClasses.MyGiftCardStore.NikeStore.NikeStore;
import Mediator.mediatorClasses.MyGiftCardStore.interfaces.StoresInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StoresInterface nikeStore = new NikeStore();
        Mediator mediator = new Mediator(nikeStore);

        List<Products> productsList = new ArrayList<Products>();

        for (int i = 0; i < 5; i++) {
            Products products = new Products(i, "product" + 1, 50.0 + i);
            productsList.add(products);
        }
        System.out.println("Store -------------------------------------------");
        nikeStore.addProducts(productsList);
        nikeStore.showProducts();

        Buyer buyer = new Buyer(mediator);
        System.out.println("Buyer -------------------------------------------");
        buyer.getProducts();
        buyer.buyProduct(1);
        buyer.buyProduct(2);
        System.out.println("Buyer produtos restando -------------------------");
        buyer.getProducts();

    }
}
