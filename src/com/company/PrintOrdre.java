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
        printWriter.write(nummer.Getline(menuNumber));
        printWriter.close();
    }


   public void Readorder() {
        // make for sentence :D
            int n =0 ; // The line number
            try{
                String line = Files.readAllLines(Paths.get("Ordrer.txt")).get(n);

                System.out.println(line);
                n++;
            }
            catch(IOException e){
                System.out.println(e);
            }
        }
    }

