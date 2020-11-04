package com.company;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    MenuPizza pizza = new MenuPizza();
    filecreator goddag = new filecreator();


    void run() {
        String headerText = "Marios Pizza:"; // Text to print ABOVE menu
        String leadText = "Please choose on of the following options: "; // Lead text to print when asking user to make choice
        // Array of menu items:
        String[] menuItems = { "1. Choose ONE", "2. Choose TWO", "3. Choose THREE", "9. QUIT" };
        boolean run = true; // Don't change!
        int choice = -1; // Don't change!
        //printPizzaMenu();
        while (run) {
            Menu menu = new Menu(headerText, leadText, menuItems); // Create new menu instance
            menu.printMenu(); // Print menu
            choice = menu.readChoice(); // Ask user to choose menu item

            // Switch on user's choice:
            switch (choice) {
                case 1:
                    System.out.println("You chose ONE");

                    break;
                case 2:
                    System.out.println("You chose 2. Pizza menu");
                    // pizza menu
                    break;
                case 3:
                    System.out.println("Hey Mario, Heres your statistics");
                    //statistic
                    break;
                case 9:
                    System.out.println("Quitting.");
                    run = false;
                    break;
                default:
                    System.out.println("You chose an INVALID NUMBER");
                    break;
            };
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Main main = new Main();
        main.file();

        main.run();

    }
   /*public void printPizzaMenu(){
        pizza.add("1", "Magarita", 0);
        pizza.add("2", "Vesuvio", 0);
        pizza.add("3", "Capricciossa", 0);
        pizza.add("4", "Calzone", 0);
        pizza.add("5", "Quatro Staggioni", 0);
        pizza.add("6", "Marinara", 0);
        pizza.add("8", "Vegetarinarr", 0);
        pizza.add("9", "Vegetarinarr", 0);
        pizza.add("10", "Vegetarinarr", 0);
        pizza.add("11", "Vegetarinarr", 0);
        pizza.add("12", "Vegetarinarr", 0);
        pizza.add("13", "Vegetarinarr", 0);
        pizza.add("14", "Vegetarinarr", 0);
        pizza.add("15", "Vegetarinarr", 0);
        pizza.add("16", "Vegetarinarr", 0);
        pizza.add("17", "Vegetarinarr", 0);
        pizza.add("18", "Vegetarinarr", 0);
        pizza.add("19", "Vegetarinarr", 0);
        pizza.add("20", "Vegetarinarr", 0);
        pizza.add("21", "Vegetarinarr", 0);
        pizza.add("22", "Vegetarinarr", 0);
        pizza.add("23", "Vegetarinarr", 0);
        pizza.add("24", "Vegetarinarr", 0);
        pizza.add("25", "Vegetarinarr", 0);
        pizza.add("26", "Vegetarinarr", 0);
        pizza.add("27", "Vegetarinarr", 0);
        pizza.add("28", "Vegetarinarr", 0);
        pizza.add("29", "Vegetarinarr", 0);
        pizza.add("30", "Vegetarinarr", 0);
        pizza.printALL();
    }
*/
   /* public void file(){
        try {
            pizza.writeToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */

    public void file() throws FileNotFoundException {
        goddag.filereader();
    }
}