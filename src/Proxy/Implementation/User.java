package Proxy.Implementation;

import Proxy.Interfaces.UserInterface;
import Proxy.models.Address;

import java.util.Timer;
import java.util.TimerTask;

public class User implements UserInterface {
    public String firstName;
    public String username;

    public User(String name, String username) {
        this.firstName = name;
        this.username = username;
    }

    @Override
    public Address getAddresses() {
        Address address = new Address();
        address.setStreet("Rua");
        address.setNumber("06");

        int hardTimeout = 5; // seconds
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
               System.out.println("Address");
            }
        };

        new Timer(true).schedule(task, hardTimeout * 2000);

        return address;
    }
}
