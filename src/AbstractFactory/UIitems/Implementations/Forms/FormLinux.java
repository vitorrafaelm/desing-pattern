package AbstractFactory.UIitems.Implementations.Forms;

import AbstractFactory.UIitems.Interfaces.Form;

public class FormLinux implements Form {
    private String name;

    @Override
    public void createForm(String formName) {
        this.name = formName;
    }

    @Override
    public String toString() {
        return "name: '" + name;
    }
}
