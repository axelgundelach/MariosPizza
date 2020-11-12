package com.company;
import java.io.*;
import java.util.Date;
import java.util.Scanner;


public class  PrintOrdre {
    pizzaFileReader nummer = new pizzaFileReader();

    public void writeOrdrer(int menuNumber) throws IOException {
        Writer output = new BufferedWriter(new FileWriter("Ordrer.txt",true));
            output.append("\n_______________________________________________________");
            output.append("\n" + Timeoforder() + "\n" + nummer.Getline(menuNumber));
            output.close();
    }

    public void clearFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("Ordrer.txt");
        writer.print("");
        writer.close();

    }

    public String Timeoforder(){
            Date date = new Date();
        System.out.println("Date of purchase: " + date);
        return "Date of purchase: " + date;

    }

   public void Readorder() throws FileNotFoundException {
       File file = new File("Ordrer.txt");
       Scanner scan = new Scanner(file);
       while(scan.hasNextLine()){
           System.out.println(scan.nextLine());
       }
    }

    }

