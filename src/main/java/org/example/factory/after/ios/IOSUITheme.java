package org.example.factory.after.ios;

import org.example.factory.after.base.Theme;
import org.example.factory.after.base.ThemeComponentFactory;

public class IOSUITheme extends Theme {

    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new IOSUIThemeComponentFactory();
    }

    @Override
    public boolean changePrimaryColor() {
        return false;
    }
}
