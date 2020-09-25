package opg05_02_Trekanter;

import java.util.Scanner;

public class Trekanter {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  
        System.out.println("Indtast sidelængden a: ");
        double a = scan.nextInt();
        System.out.println("Indtast sidelængden b: ");
        double b = scan.nextInt();
        System.out.println("Indtast sidelængden c: ");
        double c = scan.nextInt();
        if (a <= 0 || b <= 0 || c <= 0 || c >= a + b || b >= a + c || a >= b + c ){
            System.out.println("Noget er galt!");
        }else if(a==b && a==c){
            System.out.println("Trekanten er ligesidet");
        }else if(a==b || a==c || b==c){
            System.out.println("Trekanten er ligebenet");
        }else if(Math.abs((a*a+b*b)/(c*c)-1) <= 0.01 || Math.abs((a*a+c*c)/(b*b)-1) <= 0.01 ||Math.abs((c*c+b*b)/(a*a)-1) <= 0.01){
            System.out.println("Trekanten er retvinklet");
        }else if(c*c < a*a+b*b && b*b < a*a+c*c && a*a < c*c+b*b){
            System.out.println("Trekanten er spids");
        }else {
            System.out.println("Trekanten er stump");
        }
        scan.close();
  
    }
}
