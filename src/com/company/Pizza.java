package com.company;

public class Pizza {

    String pizza;
    String menuNumber;

    public Pizza(String menuNumber, String pizza){
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
        return this.menuNumber + ". " + this.pizza;
    }

}
