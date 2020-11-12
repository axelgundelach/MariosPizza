package com.company;
import java.io.*;
import java.util.Date;
import java.util.Scanner;


public class  PrintOrdre {


    pizzaFileReader nummer = new pizzaFileReader();

    /**
     * Getline pizzaFileReader that gets line from textfile menukort
     * Adds "getsline" to ordertxt
      * @param menuNumber
     * @throws IOException
     */

    public void writeOrdrer(int menuNumber) throws IOException {
        Writer output = new BufferedWriter(new FileWriter("Ordrer.txt",true));
            output.append("\n_______________________________________________________");
            output.append("\n" + Timeoforder() + "\n" + nummer.Getline(menuNumber));
            output.close();
    }

    /**
     * deletes all data from file
     * @throws FileNotFoundException
     */
    public void clearFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("Ordrer.txt");
        writer.print("");
        writer.close();

    }

    /**
     * Time for when the Pizza is ordered
     * @return Dato for køb
     */
    public String Timeoforder(){
            Date date = new Date();
        System.out.println("Date of purchase: " + date);
        return "Date of purchase: " + date;

    }

    /**
     * Method that reads an txt file through while loop
     * Scanner thats scan through the file
     * @throws FileNotFoundException
     * while loop that scans file until theres no more lines
     */
   public void Readorder() throws FileNotFoundException {
       File file = new File("Ordrer.txt");
       Scanner scan = new Scanner(file);
       while(scan.hasNextLine()){
           System.out.println(scan.nextLine());
       }
    }

    }

