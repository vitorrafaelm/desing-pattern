package Mediator.mediatorClasses.MyGiftCardStore.interfaces;

import Mediator.auxiliarClasses.Products;
import Mediator.mediator.Mediator;

import java.util.ArrayList;
import java.util.List;

public interface StoresInterface {
    public void showProducts();
    public void addProducts(List<Products> productsList);

    public void setMediator(Mediator mediator);

    public void sellProduct(int idProduct);
}
