package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stat {

    public void readFilestat() throws FileNotFoundException {
        File file = new File("C:/Users/Wande/Desktop/Statistik.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    }

    public void pizzaStatistik(int Pizzacounter, String menuNumber){

    }
}
