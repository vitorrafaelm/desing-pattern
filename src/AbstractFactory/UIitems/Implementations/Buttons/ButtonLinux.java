package AbstractFactory.UIitems.Implementations.Buttons;

import AbstractFactory.UIitems.Interfaces.Button;

public class ButtonLinux implements Button {
    private String name;

    @Override
    public void createButton(String buttonName) {
        this.name = buttonName;
    }

    public void newMethodTest() {
        System.out.println("newMethodTest");
    }

    @Override
    public String toString() {
        return "name: '" + name;
    }
}
