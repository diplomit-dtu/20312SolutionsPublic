package opg11_05_Filhaandtering;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.StandardOpenOption.APPEND;

public class ReadFile {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File("Uge12/matador_felter.txt"));

            String readString = "";
            while(scan.hasNextLine()){
                readString += scan.nextLine() + ";";
            }

            String[] fieldStrings = readString.split(";");
            String[] row = fieldStrings[0].split("\t");

            System.out.println("row[0] " + row[0]);
            System.out.println("row[1] " + row[1]);



            fieldStrings =  bubbleSort(fieldStrings);

            for (int i  = 0; i < fieldStrings.length; i ++)
                try {
                    Files.write(Paths.get("uge12/matador_felter_sort.txt"), (fieldStrings[i] + System.lineSeparator()).getBytes(), APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String[] bubbleSort(String[] fieldStrings) {
        for (int i = 0; i<fieldStrings.length;i++){
            for (int j = 1; j< fieldStrings.length-i; j++){
                if (Integer.parseInt(fieldStrings[j-1].split("\t")[0])>Integer.parseInt(fieldStrings[j].split("\t")[0])){
                    //Swap integers
                    String temp;
                    temp = fieldStrings[j-1];
                    fieldStrings[j-1] = fieldStrings[j];
                    fieldStrings[j] = temp;
                }
            }
        }
        return fieldStrings;
    }
}
