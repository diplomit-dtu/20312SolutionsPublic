package opg09_05_Lige_og_ulige;

import java.util.Scanner;

public class Evens {
 
    public static void main(String[] args) {
        int[] ints = parseInput();
        //TODO Fill in logic
          int evens = 0;
          for (int i = 0;i < ints.length;i++) if (ints[i]%2==0) evens++;      
         
        //TODO Print the result to console
        System.out.println(evens);
    }
 
    private static int[] parseInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] strings = input.split(" ");
        int[] ints = new int[strings.length]; 
        for (int i = 0;i<ints.length;i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        scan.close();
        return ints;
    }
 
}
