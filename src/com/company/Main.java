package com.company;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    filecreator goddag = new filecreator();
    PrintOrdre farvel = new PrintOrdre();
    Stat godformiddag = new Stat();

    void run() throws IOException {
        godformiddag.loadList();
        String headerText = "Marios Pizza:"; // Text to print ABOVE menu
        String leadText = "Please choose on of the following options: "; // Lead text to print when asking user to make choice
        // Array of menu items:
        String[] menuItems = { "1. Order Pizza", "2. Print current orders", "3. Show Statistics ", "9. QUIT" };
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
                    System.out.println("Choose Desired pizza");
                    int menuNumber = menu.readChoice();
                    farvel.writeOrdrer(menuNumber);
                    String mb = String.valueOf(menuNumber);
                    godformiddag.statistikCounter(mb);
                    godformiddag.prisSamler(mb);
                    break;
                case 2:
                    System.out.println("Heres you current orders");
                    farvel.Readorder();
                    break;
                case 3:
                    System.out.println("Hey Mario, Heres your statistics");
                    godformiddag.Printall();
                    System.out.println("Omsøtning" + godformiddag.omsætning());
                    break;
                case 9:
                    System.out.println("Quitting.");
                    farvel.clearFile();
                    godformiddag.saveList();
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
    }
}