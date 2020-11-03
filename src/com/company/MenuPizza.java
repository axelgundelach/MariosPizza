package com.company;
import java.util.Arrays;
public class MenuPizza {

    String pizzaNumber;
    String pizzaName;
    String[] pizzaMenu;

    public MenuPizza(){
        pizzaMenu[0] = "Magarita";
        pizzaMenu[1] = "Pepperoni";
        pizzaMenu[2] = "";
        pizzaMenu[3] = "magarita";
        pizzaMenu[4] = "magarita";
        pizzaMenu[5] = "magarita";
        pizzaMenu[6] = "magarita";
        pizzaMenu[7] = "magarita";
        pizzaMenu[8] = "magarita";
        pizzaMenu[9] = "magarita";
        pizzaMenu[10] = "magarita";
        pizzaMenu[11] = "magarita";
        pizzaMenu[12] = "magarita";
        pizzaMenu[13] = "magarita";
        pizzaMenu[14] = "magarita";
        pizzaMenu[15] = "magarita";
        pizzaMenu[16] = "magarita";
        pizzaMenu[17] = "magarita";
        pizzaMenu[18] = "magarita";
        pizzaMenu[19] = "magarita";
        pizzaMenu[20] = "magarita";
        pizzaMenu[21] = "magarita";
        pizzaMenu[22] = "magarita";
        pizzaMenu[23] = "magarita";
        pizzaMenu[24] = "magarita";
        pizzaMenu[25] = "magarita";
        pizzaMenu[26] = "magarita";
        pizzaMenu[27] = "magarita";
        pizzaMenu[28] = "magarita";
        pizzaMenu[29] = "magarita";
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
