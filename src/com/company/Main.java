package com.company;


public class Main {

    MenuPizza menuPizza = new MenuPizza();

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
        Main main =  new Main();
        new Main().run();
        main.Print();



    }

    public void Print(){
        System.out.println(menuPizza.printMenu());
    }
}