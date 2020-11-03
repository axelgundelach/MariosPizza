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
            pizza.printALL();

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
        new Main().run();
    }
    public void printPizzaMenu(){
        pizza.add("1", "Magarita");
        pizza.add("2", "Vesuvio");
        pizza.add("3", "Capricciossa");
        pizza.add("4", "Calzone");
        pizza.add("5", "Quatro Staggioni");
        pizza.add("6", "Marinara");
        pizza.add("7", "Vegetarinarr");

      /*  pizzaMenu[1] = "Pepperoni";
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

       */
    }
}