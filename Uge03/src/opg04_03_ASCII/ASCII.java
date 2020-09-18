package opg04_03_ASCII;

import java.util.Scanner;

public class ASCII {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        while(true){
            String input = scan.next();
            if (input.equals("exit")) break;
            char c = input.charAt(0);
            if (c >= '0' && c <='9'){
                System.out.println("Tegnet er et tal");
            } else if (c>='A' && c <='Z'){
                System.out.println("Tegnet er et stort bogstav");
            } else if (c>='a' && c <='z') {
                System.out.println("Tegnet er et lille bogstav");
            } else if (c=='#' || c =='!' || c =='\\' || c == '+' ) {
                System.out.println("Tegnet er et af de 4 specialtegn");
            } else {
                System.out.println("Tegnet er ikke kendt af dette program");
            }
        }
        scan.close();
 
    }
 
}
