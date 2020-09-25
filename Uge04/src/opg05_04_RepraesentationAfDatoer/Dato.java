package opg05_04_RepraesentationAfDatoer;

import java.text.NumberFormat;

public class Dato {
    int year, month, day;
    public Dato(int year, int month, int day){

        if(month <= 0 || month > 12){
            System.exit(0);
        }
        //Checker ikke for månedernes længde...
        if(day <= 0 || day > 31){
            System.exit(0);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public String danish(){
        return day+"/"+month+"-"+year;
    }
    public String danishText(){
        String monthStr;
        switch(this.month){
        case 1: monthStr = "januar"; break;
        case 2: monthStr = "februar"; break;
        case 3: monthStr = "marts"; break;
        case 4: monthStr = "april"; break;
        case 5: monthStr = "maj"; break;
        case 6: monthStr = "juni"; break;
        case 7: monthStr = "juli"; break;
        case 8: monthStr = "august"; break;
        case 9: monthStr = "september"; break;
        case 10: monthStr = "oktober"; break;
        case 11: monthStr = "november"; break;
        case 12: monthStr = "december"; break;
        default: monthStr = "oktember";
        }
        return day+". "+monthStr+" "+year;
    }
    public String iso(){
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumIntegerDigits(2);
        nf.setGroupingUsed(false);
        return nf.format(year)+"-"+nf.format(month)+"-"+nf.format(day);
    }
    public static void main(String[] args) {
        Dato d = new Dato(2011, 9, 20);
        System.out.println(d.danish());
        System.out.println(d.danishText());
        System.out.println(d.iso());
    }
}