package opg03_04_Andengradsligning;
 
import java.util.Scanner;
 
public class Andengradsligning {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c,d,x1,x2;
        //Indlæs koefficienter
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        //Beregn diskriminant
        d = b*b - 4*a*c;
         
        if (a==0 && b!=0){
            //Tilfælde med linje
            x1 = -c/b;
            System.out.println(x1);
        } else if (a==0 && b==0){
            //Tilfælde med vandret linje
            System.out.println("Ingen rødder");
        } else if (d<0) {
            //Tilfælde hvor parablen ikke når x aksen
            System.out.println("Ingen rødder");
        } else if (d==0){
            //Parablen rører kun et sted
            x1 = -b/(2*a);
            System.out.println(x1);
        } else {
            //To skæringspunkter
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println(x1 + " " + x2 );
        }
        scan.close();
 
 
    }
 
}