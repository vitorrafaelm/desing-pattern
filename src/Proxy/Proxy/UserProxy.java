package Proxy.Proxy;

import Proxy.Implementation.User;
import Proxy.Interfaces.UserInterface;
import Proxy.models.Address;

public class UserProxy implements UserInterface {
    private UserInterface realUser;
    private Address realUserAddress;
    public String firstName;
    public String username;

    public UserProxy(String name, String username) {
        this.firstName = name;
        this.username = username;
    }

    private UserInterface createUser() {
        if(this.realUser==null) {
            this.realUser = new User(this.firstName, this.username);
            return this.realUser;
        }

        return this.realUser;
    }
    @Override
    public Address getAddresses() {
        this.realUser = createUser();

        if(this.realUserAddress==null) {
            System.out.println("Criou novo endereço");
            this.realUserAddress = this.realUser.getAddresses();
            return this.realUserAddress;
        }
        System.out.println("Usou endereço em cache");
        return this.realUser.getAddresses();
    }
}
