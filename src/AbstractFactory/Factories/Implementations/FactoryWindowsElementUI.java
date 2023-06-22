package AbstractFactory.Factories.Implementations;

import AbstractFactory.Factories.Interfaces.FactoryElementUI;
import AbstractFactory.UIitems.Implementations.Buttons.ButtonWindows;
import AbstractFactory.UIitems.Implementations.Forms.FormWindows;
import AbstractFactory.UIitems.Interfaces.Button;
import AbstractFactory.UIitems.Interfaces.Form;

public class FactoryWindowsElementUI implements FactoryElementUI {
    @Override
    public Button createButton(String buttonName) {
        Button buttonWindows = new ButtonWindows();
        buttonWindows.createButton(buttonName);
        return buttonWindows;
    }

    @Override
    public Form createForm(String formName) {
        Form formWindows = new FormWindows();
        formWindows.createForm(formName);
        return formWindows;
    }
}
