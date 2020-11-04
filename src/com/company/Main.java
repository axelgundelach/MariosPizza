package com.company;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    MenuPizza pizza = new MenuPizza();
    filecreator goddag = new filecreator();
    PrintOrdre farvel = new PrintOrdre();

    void run() throws IOException {
        String headerText = "Marios Pizza:"; // Text to print ABOVE menu
        String leadText = "Please choose on of the following options: "; // Lead text to print when asking user to make choice
        // Array of menu items:
        String[] menuItems = { "1. Choose ONE", "2. Choose TWO", "3. Choose THREE", "9. QUIT" };
        boolean run = true; // Don't change!
        int choice = -1; // Don't change!
        while (run) {
           Menu menu = new Menu(headerText, leadText, menuItems);
            menu.printMenu(); // Print menu
            choice = menu.readChoice(); // Ask user to choose menu item

            // Switch on user's choice:
            switch (choice) {
                case 1:
                    file();
                    System.out.println("Choose one pizza");
                    int menuNumber = menu.readChoice();
                    farvel.writeOrdrer(menuNumber);
                    break;
                case 2:
                    System.out.println("You chose 2. Pizza menu");
                    // pizza menu
                    break;
                case 3:
                    System.out.println("Hey Mario, Heres your statistics");
                    //statistic
                    break;
                case 4:
                    farvel.Readorder();
                case 9:
                    System.out.println("Quitting.");
                    run = false;
                    break;
                default:
                    System.out.println("You chose an INVALID NUMBER");
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.file();

        main.run();

    }

    public void file() throws FileNotFoundException {
        goddag.filereader();
        goddag.filestat();
        goddag.fileOdre();
    }
}