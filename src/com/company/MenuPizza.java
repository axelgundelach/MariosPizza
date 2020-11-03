package com.company;
import java.util.ArrayList;

public class MenuPizza {

    private ArrayList<Pizza> pizzavalg = new ArrayList<Pizza>();

    public void add(String menuNumber, String PizzaName) {
        Pizza pizza = new Pizza(menuNumber, PizzaName);
        this.pizzavalg.add(pizza);
    }

    public String searchPizza(String menuNumber) {
        for (Pizza pizza : pizzavalg) {
            if (menuNumber.compareTo(pizza.getMenuNumber()) == 0) {
                return pizza.getPizza();
            }
        }

        public void printAll(){
            for (Pizza pizza : pizzavalg) {
                System.out.println(pizza);
            }
        }
    }
}
