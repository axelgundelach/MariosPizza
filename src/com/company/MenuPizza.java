package com.company;

public class MenuPizza {

    String pizzaNumber;
    String pizzaName;

    public MenuPizza(String pizzaName, String pizzaNumber ){
        this.pizzaName = pizzaName;
        this.pizzaNumber = pizzaNumber;
    }

    public String getPizzaNumber(){
        return pizzaNumber;
    }

    public String getPizzaName(){
        return pizzaName;
    }
}
