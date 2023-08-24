package Mediator.mediator;

import Mediator.auxiliarClasses.Products;
import Mediator.mediatorClasses.MyGiftCardStore.NikeStore.NikeStore;
import Mediator.mediatorClasses.MyGiftCardStore.interfaces.StoresInterface;

import java.util.List;

public class Mediator {
    StoresInterface store;
    public Mediator(StoresInterface store) {
        this.store = store;
    }

    public void addProducts(List<Products> productsList) {
        store.addProducts(productsList);
        store.setMediator(this);
    }

    public void buy(int id) {
        store.sellProduct(id);
    }

    public void getProducts(){
        store.showProducts();
    }


}

