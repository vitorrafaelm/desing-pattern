package TemplateMethod.Implementation;

import TemplateMethod.AbstarctClass.TemplateMethodBaseClassCreateUserAndLogin;
import TemplateMethod.Models.User;

import java.util.ArrayList;
import java.util.List;

public class Implementation extends TemplateMethodBaseClassCreateUserAndLogin<User> {

    List<User> users = new ArrayList<User>();

    @Override
    protected User createUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    protected String login(User user) {
        int userIndex = users.indexOf(user);

        if(userIndex > 0) {
            return "User logged";
        }

        return "User does not exists";
    }

    @Override
    protected void notificaPadrao() {
        System.out.println("Usuário cadastrado!");
    }
    public List<User> getUsers() {
        return users;
    }
}
