package com.company;


public class Main {
    MenuPizza pizza = new MenuPizza();

    void run() {
        String headerText = "Marios Pizza:"; // Text to print ABOVE menu
        String leadText = "Please choose on of the following options: "; // Lead text to print when asking user to make choice
        // Array of menu items:
        String[] menuItems = { "1. Choose ONE", "2. Choose TWO", "3. Choose THREE", "9. QUIT" };
        boolean run = true; // Don't change!
        int choice = -1; // Don't change!

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



    public static void main(String[] args) {
        Main main = new Main();
        new Main().printPizzaMenu();
        new Main().run();
    }
    public void printPizzaMenu(){
        pizza.add("1", "Magarita");
        pizza.add("2", "Vesuvio");
        pizza.add("3", "Capricciossa");
        pizza.add("4", "Calzone");
        pizza.add("5", "Quatro Staggioni");
        pizza.add("6", "Marinara");
        pizza.add("8", "Vegetarinarr");
        pizza.add("9", "Vegetarinarr");
        pizza.add("10", "Vegetarinarr");
        pizza.add("11", "Vegetarinarr");
        pizza.add("12", "Vegetarinarr");
        pizza.add("13", "Vegetarinarr");
        pizza.add("14", "Vegetarinarr");
        pizza.add("15", "Vegetarinarr");
        pizza.add("16", "Vegetarinarr");
        pizza.add("17", "Vegetarinarr");
        pizza.add("18", "Vegetarinarr");
        pizza.add("19", "Vegetarinarr");
        pizza.add("20", "Vegetarinarr");
        pizza.add("21", "Vegetarinarr");
        pizza.add("22", "Vegetarinarr");
        pizza.add("23", "Vegetarinarr");
        pizza.add("24", "Vegetarinarr");
        pizza.add("25", "Vegetarinarr");
        pizza.add("26", "Vegetarinarr");
        pizza.add("27", "Vegetarinarr");
        pizza.add("28", "Vegetarinarr");
        pizza.add("29", "Vegetarinarr");
        pizza.add("30", "Vegetarinarr");
        pizza.printALL();
    }
}