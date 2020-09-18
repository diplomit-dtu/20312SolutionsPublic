package opg04_07_Sinusfunktion;

import java.util.Scanner;

public class SinusFunktion {
    final static int STEPSPERIOD = 16; //Samples pr period
    final static double STEPSIZE = 2*Math.PI/STEPSPERIOD;
    final static int AMPLITUDE = 20; //Amplitude of sine wave
     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int periods = scan.nextInt();
        int steps = periods*STEPSPERIOD;
         
        for(int x = 0; x<steps; x++){
            int y = (int)(Math.sin(x*STEPSIZE)*AMPLITUDE);
            String str = "";
            for(int i = -AMPLITUDE; i<=AMPLITUDE; i++){
                if(i == y){str+="*";}
                else if(i == 0){str+="|";}
                else{str+=" ";}
            }
            System.out.println(str);
        }
        scan.close();
    }
}