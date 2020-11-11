package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Stat {
    ArrayList<Pizza> stat = new ArrayList<>();
    private final String FILENAME = "C:/Users/Wande/Desktop/Statistik.txt";

    public void loadList() {
        ArrayList<Pizza> pizzaFromFile = new ArrayList<>();
        Pizza p;
        try {
            Scanner fileReader = new Scanner(new File(FILENAME));
            while (fileReader.hasNext()) {
                pizzaFromFile.add(new Pizza(
                        fileReader.nextLine(), // pizzanumber
                        fileReader.nextLine(), // Pizza navn
                        fileReader.nextLine(),  // Pris
                        fileReader.nextLine())); // pizza counter
            }
            stat = pizzaFromFile;
            System.out.println("\nFile loaded.\n");
        } catch (IOException e) {
            System.out.println("\nI/O exception: " + e + "\n");
        }
    }

    void saveList() {
        try {
            PrintStream outFile = new PrintStream(new File(FILENAME));
            for (int i = 0; i < stat.size(); i++) {
                Pizza p = stat.get(i);
                outFile.println(p.getMenuNumber());
                outFile.println(p.getPizza());
                outFile.println(p.getPris());
                outFile.println(p.getPizzacount());
            }
            System.out.println("\nFile saved.\n");
        } catch (IOException e) {
            System.out.println("\nI/O exception: " + e + "\n");
        }
    }

    public String statistikCounter(String menuNumber) {
        for (Pizza pizza : stat) {
            Integer num = Integer.valueOf(pizza.getPizzacount());
            if (menuNumber.compareTo(pizza.getMenuNumber()) == 0) {
                int newCounter = num + 1;
                String lol = String.valueOf(newCounter);
                return pizza.setPizzacount(lol);
            }
        }
        return "kunne ikke finde pizzaen";
    }

    public String prisSamler(String menuNumber) {
        for (Pizza pizza : stat) {
            String mb = String.valueOf(pizza.getMenuNumber());
            if (menuNumber.compareTo(mb) == 0) {
                Integer num = Integer.valueOf(pizza.getPris());
                int i = Integer.parseInt(menuNumber);
                if (i <= 10) {
                    int totalSoldPizza = num + 50;
                    String Giderikkemere = String.valueOf(totalSoldPizza);
                    return pizza.setPris(Giderikkemere);
                } else if (i <= 20) {
                    int totalSoldPizza = num + 60;
                    String Giderikkemere = String.valueOf(totalSoldPizza);
                    return pizza.setPris(Giderikkemere);
                } else if (i <= 30) {
                    int totalSoldPizza = num + 70;
                    String Giderikkemere = String.valueOf(totalSoldPizza);
                    return pizza.setPris(Giderikkemere);
                }
            }
        }
        return "kunne ikke finde pizzaen";
    }

    public void Printall() {
        for (Pizza pizza : stat)
            System.out.println(pizza);
    }

    public void omsætning() {
            int sum = 0;
        for (int i = 0; i < stat.size(); i++ ) {
            Pizza p = stat.get(i);
            int a = Integer.parseInt(p.getPris());
            sum += a;
        }
        System.out.println("Omsætning: " + sum);
    }
}