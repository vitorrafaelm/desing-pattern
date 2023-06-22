package AbstractFactory.UIitems.Implementations.Buttons;

import AbstractFactory.UIitems.Interfaces.Button;

public class ButtonWindows implements Button {
    private String name;

    @Override
    public void createButton(String buttonName) {
        this.name = buttonName;
    }

    @Override
    public String toString() {
        return "name: '" + name;
    }
}
