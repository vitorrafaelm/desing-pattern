package AbstractFactory.Factories.Interfaces;

import AbstractFactory.UIitems.Interfaces.Button;
import AbstractFactory.UIitems.Interfaces.Form;

public interface FactoryElementUI {
    public Button createButton(String buttonName);
    public Form createForm(String formName);
}
