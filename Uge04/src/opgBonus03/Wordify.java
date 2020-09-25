package opgBonus03;

import java.util.Scanner;

/**
 * @author Christian Budtz
 *
 */
public class Wordify {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String output = "";
        int multi = Integer.parseInt(input.substring(input.length()-1));
        for (int i=0;i <input.length()-2;i++){
            for (int j=0;j<multi;j++){
                output+= input.charAt(i);
            }
        }
        System.out.println(output);
        scan.close();
    }
}