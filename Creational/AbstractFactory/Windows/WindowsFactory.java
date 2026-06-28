package Creational.AbstractFactory.Windows;

import Creational.AbstractFactory.Button;
import Creational.AbstractFactory.GUIFactory;
import Creational.AbstractFactory.Touchpad;
import Creational.AbstractFactory.Windows.WindowsButton;


public class WindowsFactory implements GUIFactory {
    @Override
    public Button click() {
        return new WindowsButton();
    }

    @Override
    public Touchpad scroll() {
        return new WindowsTouchpad();
    }
    
}
