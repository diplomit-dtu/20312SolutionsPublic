package opg03_02_Konvertering;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		//variable til mellemregninger
		int input, seconds, minutes, hours, days;
		//Indlæs fra konsollen
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		seconds = input;
		//beregn dage ved heltals division
		days = seconds/(24*60*60); //Hardcoded variables (bad practice)
		//Beregn resten
		seconds = seconds%(24*60*60);
		//beregn timer
		hours = seconds/(60*60);
		seconds = seconds%(60*60);
		//beregn minutter
		minutes = seconds/60;
		//Resten er seconds
		seconds = seconds%60;

		System.out.println(input + " seconds equals " + days + " days, " + hours +" hours, " + minutes + " minutes and " + seconds + " seconds.");
		scan.close();
	}
}