package opg09_07_Array_Shift2;

import java.util.Scanner;

public class RShift {
	 
    public static void main(String[] args) {
        int[] ints = parseInput();
        int[] newInts = new int[ints.length-1];
        //TODO Fill in logic
        for (int i = 0; i < newInts.length; i++) {
            int newPlace = (i + ints[ints.length-1])%newInts.length;
            if (newPlace<0) newPlace += newInts.length;
            newInts[newPlace] = ints[i];
        }   
         
        //TODO Print the result to console
        for (int i : newInts) {
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