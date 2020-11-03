package com.company;
import java.util.Arrays;
public class MenuPizza {
    String pizzaNumber;
    String pizzaName;
    String[] pizzaMenu;

    public MenuPizza(){
        pizzaMenu[0] = "Magarita";
        pizzaMenu[1] = "Pepperoni";
        pizzaMenu[2] = "Vesuvio";
        pizzaMenu[3] = "Capricciosa";
        pizzaMenu[4] = "Calzone";
        pizzaMenu[5] = "Quattro Staggioni";
        pizzaMenu[6] = "Marinara";
        pizzaMenu[7] = "Vegetarinara";
        pizzaMenu[8] = "Italiana";
        pizzaMenu[9] = "Gorgonzola";
        pizzaMenu[10] = "Maialetto";
        pizzaMenu[11] = "Napoli";
        pizzaMenu[12] = "Vikinga";
        pizzaMenu[13] = "Fantasia";
        pizzaMenu[14] = "Calabrese";
        pizzaMenu[15] = "Sardegna";
        pizzaMenu[16] = "Romana";
        pizzaMenu[17] = "Rustica";
        pizzaMenu[18] = "Costa";
        pizzaMenu[19] = "Danese";
        pizzaMenu[20] = "Rocco";
        pizzaMenu[21] = "Senza Nome";
        pizzaMenu[22] = "Leonardo";
        pizzaMenu[23] = "Salatpizza";
        pizzaMenu[24] = "Vegana";
        pizzaMenu[25] = "Felix";
        pizzaMenu[26] = "Ventricina";
        pizzaMenu[27] = "Quatro formaggi";
        pizzaMenu[28] = "Montanara";
        pizzaMenu[29] = "Patatee";
    }

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
