package com.company;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class filecreator {

public void filereader() throws FileNotFoundException {
    File file = new File("C:/Users/Wande/Desktop/Menukort.txt");
    Scanner scan = new Scanner(file);
    while(scan.hasNextLine()){
        System.out.println(scan.nextLine());
    }
}

    public String Getline(int menuNumber) throws IOException {
    String line = Files.readAllLines(Paths.get("C:/Users/Wande/Desktop/Menukort.txt")).get(menuNumber);
    return line;
    }
}

