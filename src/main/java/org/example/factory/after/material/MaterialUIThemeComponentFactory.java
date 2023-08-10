package org.example.factory.after.material;

import org.example.factory.after.base.Button;
import org.example.factory.after.base.DropDown;
import org.example.factory.after.base.Menu;
import org.example.factory.after.base.ThemeComponentFactory;

public class MaterialUIThemeComponentFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {

        return new MaterialUiButton();
    }

    @Override
    public Menu createMenu() {
        return new MaterialUiMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new MaterialUiDropDown();
    }
}
