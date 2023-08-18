package Strategy;

import Strategy.Entities.Product;
import Strategy.Implementation.FathersDay;
import Strategy.Implementation.MothersDay;
import Strategy.Interfaces.Cart;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.of(2023, 8, 5);
        int monthCartWadCreated = todayDate.getMonthValue();
        Cart<Product> cartProducts = new Strategy.Entities.Cart(todayDate);

        List<Product> products = new ArrayList<>();

        if(monthCartWadCreated == 8) {
            cartProducts.setPromotionStrategy(new FathersDay());

            Product productOne = new Product("Shirt", 100);
            Product productTwo = new Product("Jeans", 100);
            products.add(productOne);
            products.add(productTwo);

            cartProducts.addProduct(products);
            System.out.println("Total de compras sem desconto no dia dos pais: R$ " + cartProducts.getTotal());
            System.out.println("Total de compras com desconto no dia dos pais: R$ " + cartProducts.getTotalWithDiscount());
        }

        if(monthCartWadCreated == 5) {
            cartProducts.setPromotionStrategy(new MothersDay());
            Product productOne = new Product("Shirt", 100);
            Product productTwo = new Product("Jeans", 100);
            products.add(productOne);
            products.add(productTwo);

            cartProducts.addProduct(products);
            System.out.println("Total de compras sem desconto no dia das mães: R$ " + cartProducts.getTotal());
            System.out.println("Total de compras com desconto no dia das mães: R$ " + cartProducts.getTotalWithDiscount());
        }

    }
}
