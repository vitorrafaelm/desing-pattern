package TemplateMethod.Implementation;

import TemplateMethod.AbstarctClass.TemplateMethodBaseClassCreateUserAndLogin;
import TemplateMethod.Models.Admin;
import TemplateMethod.Models.User;

import java.util.ArrayList;
import java.util.List;

public class ImplementationII extends TemplateMethodBaseClassCreateUserAndLogin<Admin> {

    List<Admin> usersAdmin = new ArrayList<Admin>();

    @Override
    protected Admin createUser(Admin user) {
        usersAdmin.add(user);
        return user;
    }

    @Override
    protected String login(Admin user) {
        int userIndex = usersAdmin.indexOf(user);

        if(userIndex > 0) {
            return "User logged";
        }

        return "User does not exists";
    }

    @Override
    protected void notificaPadrao() {
        System.out.println("Administrador cadastrado com sucesso !");
    }


    public List<Admin> getUsersAdmin() {
        return usersAdmin;
    }
}
