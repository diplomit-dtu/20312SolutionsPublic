package opg11_04_Laesning_af_fil2;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    private Scanner sc;
    public void openFile(String file){
        try {
            sc = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            System.out.println("Filen kan ikke åbnes");
        }
    }
    public int[] readInts(){
        int[] ints=null;
        if (sc == null || !sc.hasNextLine()) return null;
        String[] intString = sc.nextLine().split(" ");
        ints = new int[intString.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(intString[i]);
        }
        return ints;
    }
    public void closeFile(){
        if (sc!=null){
            sc.close();
        } else {
            System.out.println("Filen kan ikke lukkes");
        }

    }

    /** For testing purposes */
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        readFile.openFile("data.txt");
        int[] ints = readFile.readInts();
        for (int i : ints){
            System.out.println(i);
        }

    }

}