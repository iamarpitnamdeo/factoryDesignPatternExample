package org.example.factory.before;

public abstract class Theme {
    String authorName;
    String primaryColor;
    int lastUpdatedDate;
    String name;

    public abstract  Button createButton();

    public abstract  Menu createMenu();

    public abstract DropDown createDropDown();
    public abstract boolean changePrimaryColor();
}
