package opg04_02_Passwords2;

import java.util.Scanner;

public class PasswordChecker2 {
 
    public static void main(String[] args) {
        //Læs noget fra konsollen
        Scanner scan = new Scanner(System.in);
        while(true){ //Bliv ved indtil et korrekt password er indtastet
            String password = scan.nextLine();
 
            //Check passwordet
            if(password.length() < 5){
                System.out.println("Password for kort");
            } else if (password.length() > 8){
                System.out.println("Password for langt");
            } else {
                System.out.println("Password tilpas");
                break; //Bryd l�kken
            }
        }
        //Husk at lukke scanneren
        scan.close();
 
    }
}