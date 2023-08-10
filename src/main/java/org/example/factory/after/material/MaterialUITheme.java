package org.example.factory.after.material;

import org.example.factory.after.base.Theme;
import org.example.factory.after.base.ThemeComponentFactory;

public class MaterialUITheme extends Theme {

    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new MaterialUIThemeComponentFactory();
    }

    @Override
    public boolean changePrimaryColor() {
        return false;
    }
}
