package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Statistik {
private String FILENAME = "antalpizza.txt";

private ArrayList<Pizza> pizzaStat = new ArrayList<Pizza>();

void writeToFile() {
   Scanner in = new Scanner(System.in);
    System.out.println("Hvilken pizza blev bestilt?");
    String pizzaValg = in.nextLine();
    System.out.println("Hvor mange pizzaer blev bestilt?");
    String antalPizza = in.nextLine();

    pizzaStat.add(new Pizza(pizzaValg, antalPizza));
    System.out.println("\n" + pizzaStat + "Tilføjet til statistik fil");
    }


    }


