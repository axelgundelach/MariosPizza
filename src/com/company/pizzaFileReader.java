package com.company;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class pizzaFileReader {

    /**
     *
     * @throws FileNotFoundException
     *
     */


public void filereader() throws FileNotFoundException {
    File file = new File("/Users/bruger/Desktop/Mario's pizza projekt/Menukort.txt");
    Scanner scan = new Scanner(file);
    while(scan.hasNextLine()){
        System.out.println(scan.nextLine());
    }
}

    /**
     *
     * @param menuNumber
     * @return
     * @throws IOException
     */

    public String Getline(int menuNumber) throws IOException {
    String line = Files.readAllLines(Paths.get("/Users/bruger/Desktop/Mario's pizza projekt/Menukort.txt")).get(menuNumber);
    return line;
    }
}

