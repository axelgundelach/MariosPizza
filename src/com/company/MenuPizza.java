package com.company;
import java.util.Arrays;
public class MenuPizza {
    String pizzaNumber;
    String pizzaName;
    String[] pizzaMenu = {"Magarita", "Pepperoni", "Vesuvio", "Caroricciosa", "Calzone", "Quattro Staggioni", "Marinara",
    "Vegeterina", "Italiana", "Gorgonzola", "Maialetto", "Napoli", "Vikinga", "Fanatasia", "Calabrese", "Sardegna", "Romana",
            "Rustica", "Costa", "danese", "Rocco", "Senza Nome", "Leonardo", "Salata Pizza", "Vegana", "Felix", "Ventricina",
            "Quatro formagii", "Montarna", "patateee"
    };

    public String printMenu(){
        return Arrays.toString(pizzaMenu) + "\n";
    }


}
