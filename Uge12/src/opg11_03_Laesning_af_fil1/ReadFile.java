package opg11_03_Laesning_af_fil1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[][] arrays = new int[][]{arr1,arr2};

        try {
            Scanner sc = new Scanner(new File("data.txt"));
            int arrayNo = 0;
            while (sc.hasNextLine()){
                String[] intStrings = sc.nextLine().split(" ");
                for (int i = 0; i<intStrings.length;i++){
                    arrays[arrayNo][i] = Integer.parseInt(intStrings[i]);
                }
                arrayNo++;
            }
            printArrays(arrays);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Filen kan ikke findes");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("For mange tal i arrayet eller for mange arrays! (Der må kun være 2 linjer med max 10 tal");
        }



    }

    private static void printArrays(int[][] arrays) {
        for (int[] arr: arrays){
            System.out.print("Array:\r\n [ ");
            for (int i : arr){

                System.out.print(i +" ");
            }
            System.out.println("]");
        }
    }

}
