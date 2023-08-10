package org.example.factory.after.ios;

import org.example.factory.after.base.Button;
import org.example.factory.after.base.DropDown;
import org.example.factory.after.base.Menu;
import org.example.factory.after.base.ThemeComponentFactory;

public class IOSUIThemeComponentFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new IOSUIButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSUIMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSUIDropDown();
    }
}
