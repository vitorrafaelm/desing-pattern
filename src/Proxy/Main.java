package Proxy;

import Proxy.Implementation.User;
import Proxy.Interfaces.UserInterface;
import Proxy.Proxy.UserProxy;

public class Main {

    public static void main(String[] args) {
        UserInterface user = new UserProxy("Victor", "victor.rafael");

        System.out.println(user.getAddresses().toString());

        for (int i = 0; i < 5; i++) {
            System.out.println(user.getAddresses().toString());
        }
    }
}
