package com.company;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class  PrintOrdre {

    filecreator nummer = new filecreator();

    public void writeOrdrer(int menuNumber) throws IOException {
        FileWriter fileWriter = new FileWriter("Ordrer.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(nummer.Getline(menuNumber));
        printWriter.close();
    }


   public void Readorder() {
            int n = 1; // The line number
            try{
                String line = Files.readAllLines(Paths.get("Ordrer.txt")).get(n);
                System.out.println(line);
            }
            catch(IOException e){
                System.out.println(e);
            }
        }
    }

