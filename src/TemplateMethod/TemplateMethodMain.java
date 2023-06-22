package TemplateMethod;

import TemplateMethod.Implementation.Implementation;
import TemplateMethod.Implementation.ImplementationII;
import TemplateMethod.Models.Admin;
import TemplateMethod.Models.User;

import java.util.List;

public class TemplateMethodMain {

    public static void main(String[] args) {
        // User normal
        User user = new User();
        user.setName("Victor Daniel");
        user.setEmail("vitor.rafael1518@gmail.com");
        user.setPassword("1234567");
        user.setUsername("victor.rafael");

        Implementation implementation = new Implementation();
        implementation.execute(user);

        List<User> userList = implementation.getUsers();
        System.out.println(userList.get(0).toString());

        // User Admin
        Admin admin = new Admin();

        admin.setName("Victor Rafael Silva");
        admin.setEmail("vitor.daniel.rafael1518@gmail.com");
        admin.setPassword("arftgyh");

        ImplementationII implementationII = new ImplementationII();
        implementationII.execute(admin);

        List<Admin> userListAdmin = implementationII.getUsersAdmin();
        System.out.println(userList.get(0).toString());

    }
}
