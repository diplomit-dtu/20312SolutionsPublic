package opg03_01_Afstand;

import java.util.Scanner;

public class Afstand {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,x0,y0, dist ;
        a = scan.nextDouble();
        b = scan.nextDouble();
        x0 = scan.nextDouble();
        y0 = scan.nextDouble();
        dist = Math.abs(a*x0-y0+b)/Math.sqrt(1+a*a);
        System.out.println(dist);
        scan.close();
    }
}