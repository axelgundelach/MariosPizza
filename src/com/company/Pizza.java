package com.company;

public class Pizza {

    String pizza;
    String menuNumber;

    public Pizza(String pizza, String menuNumber){
        this.pizza = pizza;
        this.menuNumber = menuNumber;
    }

    public String getPizza(){
        return pizza;
    }

    public String getMenuNumber(){
        return menuNumber;
    }

    public String toString(){
        return this.pizza;
    }

}
