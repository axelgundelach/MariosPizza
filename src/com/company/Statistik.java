package com.company;
import java.io.*;
import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;

public class Statistik {
    private String FILENAME = "antalpizza.txt";


public int pizzaCounter(int menuNumber, ArrayList<Pizza> pizzavalg) {
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




