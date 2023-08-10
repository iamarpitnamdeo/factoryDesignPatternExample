package org.example.factory.after.base;
//
public abstract class Theme {
    String authorName;
    String primaryColor;
    int lastUpdatedDate;
    String name;

    //Fctory method
    //factory of theme component factory
    public abstract ThemeComponentFactory createThemeComponentFactory();
    public abstract boolean changePrimaryColor();
}


// shoeFactory
//all the methods will return true
// practiacal factory

//footWearFactory
//all the methods will reutrn shoe, sandle, chapple
// abstract factory
