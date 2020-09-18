package opg04_05_Pyramider;

import java.util.Scanner;

public class Pyramider {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pyramidCount = scan.nextInt();
        //Loop for hver pyramide
        for(int pyramid = 0; pyramid < pyramidCount; pyramid++){
            System.out.println("Pyramid "+(pyramid+1));
            //Loop for hver linje i pyramiden
            for(int line = 1; line <= pyramid+1; line++){
                String str = "";
                //Loop for de f�rste punktummer
                for(int i = 0; i < pyramid - line + 1; i++){
                    str += ".";
                }
                //Loop for #
                for(int i = 0; i < 2*line - 1; i++){
                    str += "#";
                }
                //Loop for de sidste .
                for(int i = 0; i < pyramid - line + 1; i++){
                    str += ".";
                }
                System.out.println(str);
            }
            System.out.println();
        }
        scan.close();
    }   
 
}
