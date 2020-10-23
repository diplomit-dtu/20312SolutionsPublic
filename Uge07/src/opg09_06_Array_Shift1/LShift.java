package opg09_06_Array_Shift1;

import java.util.Scanner;

public class LShift {
 
    public static void main(String[] args) {
        int[] ints = parseInput();
        //TODO Fill in logic
           int first = ints[0];
            for (int i = 0; i < ints.length - 1; i++)
                ints[i] = ints[i + 1];
            ints[ints.length - 1] = first;  
         
        //TODO Print the result to console
        for (int i : ints) {
            System.out.print(i + " ");
        }
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