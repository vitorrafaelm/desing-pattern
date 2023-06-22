package AbstractFactory.Factories.Implementations;

import AbstractFactory.Factories.Interfaces.FactoryElementUI;
import AbstractFactory.UIitems.Implementations.Buttons.ButtonLinux;
import AbstractFactory.UIitems.Implementations.Forms.FormLinux;
import AbstractFactory.UIitems.Interfaces.Button;
import AbstractFactory.UIitems.Interfaces.Form;

public class FactoryLinuxElementUI implements FactoryElementUI {
    @Override
    public Button createButton(String buttonName) {
        Button buttonLinux = new ButtonLinux();
        buttonLinux.createButton("Linux Button");
        return buttonLinux;
    }

    @Override
    public Form createForm(String formName) {
        Form formLinux = new FormLinux();
        formLinux.createForm("Linux Form");
        return formLinux;
    }
}
