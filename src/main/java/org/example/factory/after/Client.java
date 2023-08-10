package org.example.factory.after;

import org.example.factory.after.base.Theme;
import org.example.factory.after.base.ThemeComponentFactory;
import org.example.factory.after.base.ThemeFactory;
import org.example.factory.after.ios.IOSUITheme;
import org.example.factory.after.material.MaterialUITheme;

public class Client {

    private static final String THEME ="material";

    public static void main(String[] args) {
        Theme theme = ThemeFactory.createThemeForIdentifier(THEME);
        ThemeComponentFactory themeComponentFactory=theme.createThemeComponentFactory();
        themeComponentFactory.createButton();
        themeComponentFactory.createMenu();
        themeComponentFactory.createDropDown();
    }
}
