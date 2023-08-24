package Mediator.mediatorClasses.MyGiftCardStore.NikeStore;

import Mediator.auxiliarClasses.Products;
import Mediator.mediator.Mediator;
import Mediator.mediatorClasses.MyGiftCardStore.interfaces.StoresInterface;

import java.util.ArrayList;
import java.util.List;

public class NikeStore implements StoresInterface {
    private List<Products> products = new ArrayList<Products>();
    Mediator mediator;

    public void showProducts() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }

    public void addProducts(List<Products> productsList) {
        for (int i = 0; i < productsList.size(); i++) {
            products.add(productsList.get(i));
        }
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sellProduct(int idProduct) {
        Products productExists = null;

        for (int i = 0; i < this.products.size(); i++) {
            if (products.get(i).id == idProduct) {
                productExists = products.get(i);
                products.remove(i);
                break;
            }
        }
        if(productExists != null) System.out.println("Produto vendido: " + productExists.toString());
    }
}
