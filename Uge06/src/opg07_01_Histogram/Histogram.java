package opg07_01_Histogram;

import java.util.Scanner;

/**
 * @author Christian Budtz
 *
 */
public class Histogram {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] intStrings = input.split(" ");
        int[] intGroups = new int[10];
        for (int i = 0; i < intStrings.length; i++) {
            int j = Integer.parseInt(intStrings[i]);
            intGroups[(j-1)/10]++;          
        }
        for (int i = 0; i < intGroups.length; i++) {
            System.out.print(((i*10+1)>9?i*10+1:i+1 + " ") + " - ");
            System.out.print((((i+1)*10>99)?(i+1)*10:(i+1)*10 + " ") + " | ");
             
            for (int j = 0; j < intGroups[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
             
        }
        scan.close();
    }
}
