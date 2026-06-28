package Creational.AbstractFactory;

import Creational.AbstractFactory.Windows.WindowsFactory;

public class Client {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.click();
        Touchpad windowsTouchpad = windowsFactory.scroll();
        windowsButton.click();
        windowsTouchpad.scroll();
    }
}
