package com.company;

public class Pizza {

    String pizza;
    String menuNumber;
    int pizzacount;

    public Pizza(String menuNumber, String pizza, int pizzacount){
        this.pizza = pizza;
        this.menuNumber = menuNumber;
        this.pizzacount = pizzacount;
    }

    public String getPizza(){
        return pizza;
    }

    public String getMenuNumber(){
        return menuNumber;
    }

    public int getPizzacount(){
        return pizzacount;
    }

    public int setPizzacount(int pizzacount){
        this.pizzacount = pizzacount;
        return pizzacount;
    }

    public String toString(){
        return this.menuNumber + ". " + this.pizza + ". " + this.getPizzacount();
    }

}
