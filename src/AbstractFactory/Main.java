package AbstractFactory;

import AbstractFactory.Factories.Implementations.FactoryLinuxElementUI;
import AbstractFactory.Factories.Implementations.FactoryWindowsElementUI;
import AbstractFactory.UIitems.Interfaces.Button;
import AbstractFactory.UIitems.Interfaces.Form;

public class Main {

    public static void main(String[] args) {
        FactoryWindowsElementUI factoryWindowsElementUI = new FactoryWindowsElementUI();

        Button buttonWindows = factoryWindowsElementUI.createButton("Windows Button");
        Form formWindows = factoryWindowsElementUI.createForm("Windows Form");

        System.out.println(buttonWindows.toString());
        System.out.println(formWindows.toString());

        System.out.println("------------------------------------------------------------");

        FactoryLinuxElementUI factoryLinuxElementUI = new FactoryLinuxElementUI();

        Button buttonLinux = factoryLinuxElementUI.createButton("Linux Button");
        Form formLinux = factoryLinuxElementUI.createForm("Linux Form");

        System.out.println(buttonLinux.toString());
        System.out.println(formLinux.toString());
    }
}
