package com.company;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class  PrintOrdre {

    filecreator nummer = new filecreator();

    public void writeOrdrer(int menuNumber) throws IOException {
        Writer output = new BufferedWriter(new FileWriter("Ordrer.txt",true));
            output.append("\n" + nummer.Getline(menuNumber));
            output.close();
    }

    public void clearFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("Ordrer.txt");
        writer.print("");
        writer.close();
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

