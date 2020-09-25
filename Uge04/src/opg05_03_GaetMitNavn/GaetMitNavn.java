package opg05_03_GaetMitNavn;

import java.util.Scanner;

public class GaetMitNavn {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String guess = "";
        while(!name.toLowerCase().equals((guess = scan.nextLine()).toLowerCase())){
            switch(compare(name,guess)){
            case -1: System.out.println("Mit navn er før i alfabetet.");break;
            case 1: System.out.println("Mit navn er efter i alfabetet.");break;
            }
        }
        System.out.println("Du gættede rigtigt.");
        scan.close();
        System.exit(0);
    }
 
    public static int compare(String name, String guess){
        int i = 0;
        while(i < name.length() && i < guess.length()){
            if(name.toLowerCase().charAt(i) < guess.toLowerCase().charAt(i)){return -1;}
            if(name.toLowerCase().charAt(i) > guess.toLowerCase().charAt(i)){return 1;}
            i++;
        }
        if(name.length() < guess.length()){return -1;}
        if(name.length() > guess.length()){return 1;}
 
        return 0;
 
    }
}