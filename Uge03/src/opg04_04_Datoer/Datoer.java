package opg04_04_Datoer;

/** @author Christian Budtz  **/
import java.util.Scanner;
  
public class Datoer {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indtast år:");
        int year = scan.nextInt();
        //Her bruges et sammensat logisk udtryk til at afgøre om det er et skudår
        boolean leapYear = (year%4== 0 && !(year%100 ==0 && year%400!=0));
        System.out.println("Indtast måned:");
        int month = scan.nextInt();
        System.out.println("Indtast dag:");
        int day = scan.nextInt();
  
        int daysInMonth;
        switch (month) {
        case 2: //februar
            if (leapYear){
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
            break;
        case 4: //De korte måneder
        case 6:
        case 9:
        case 11:
            daysInMonth = 30;
            break;
        default: //Alle de andre
            daysInMonth = 31;
            break;
        }
        if (day> daysInMonth || day<1 || month <1 || month>12) {
            System.out.println("Ugyldig dato");
        } else {
        boolean lastDayInMonth = day == daysInMonth ? true:false;
        boolean lastDayInYear = lastDayInMonth && month == 12;
        int nextDay = lastDayInMonth ? 1 : day+1;
        int nextMonth = lastDayInMonth ? (lastDayInYear?1:month+1):month;
        int nextYear = lastDayInYear ? year+1:year;
          
        System.out.print("Dagen efter " + day +"/" + month + " " + year + " er " );
        System.out.println(nextDay + "/" + nextMonth + " " + nextYear);
        }
        scan.close();
    }
}
