package org.example.factory.after.base;

import org.example.factory.after.ios.IOSUITheme;
import org.example.factory.after.material.MaterialUITheme;


//Practial Factory
//XFactory
//return type of all the methods will be x
public class ThemeFactory {
    public static Theme createThemeForIdentifier(String themeName){
       if(themeName.equals("material")){
          return new MaterialUITheme();
       }else{
           return new IOSUITheme();
       }
    }
}
