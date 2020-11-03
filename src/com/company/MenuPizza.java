package com.company;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MenuPizza {

    public ArrayList<Pizza> pizzavalg = new ArrayList<Pizza>();
    private String FILENAME = "antalpizza.txt";

    public void add(String menuNumber, String PizzaName, int pizzaCount) {
        Pizza pizza = new Pizza(menuNumber, PizzaName, pizzaCount);
        this.pizzavalg.add(pizza);
    }

    public String searchPizza(String menuNumber) {
        for (Pizza pizza : pizzavalg) {
            if (menuNumber.compareTo(pizza.getMenuNumber()) == 0) {
                return pizza.getPizza();
            }
        }
        return "kunne ikke finde pizzaen";
    }

        public void printALL(){
            for (Pizza pizza : pizzavalg) {
                System.out.println(pizza);
            }
        }

    public int pizzaCounter(String menuNumber) {
        for (Pizza pizza : pizzavalg) {
            if (menuNumber.compareTo(pizza.getMenuNumber()) == 0) {
                int newPizzaCount = pizza.getPizzacount() + 1;
                return pizza.setPizzacount(newPizzaCount);
            }
        }
        return 0;
    }

    void writeToFile() throws IOException {
        FileOutputStream fos = new FileOutputStream(FILENAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(pizzavalg);
        oos.close();
    }

    }
