package org.example.factory.after.base;
//abstract factory
//XFactory
//return types will be the things that are related to x
//all the methods in abstract factory -> factory methods
public interface ThemeComponentFactory {
     Button createButton();

     Menu createMenu();

     DropDown createDropDown();

}
