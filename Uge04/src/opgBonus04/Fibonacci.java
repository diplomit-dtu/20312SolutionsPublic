package opgBonus04;

import java.util.Scanner;

public class Fibonacci {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i<n ; i++){
            System.out.println(fibo(i));
        }
        scan.close();
    }
 
    private static int fibo(int i) {
        if (i <2) return 1;
        int fibo1 = 1,fibo2 = 1, fibonacci = 1;
        for (int j = 1; j< i; j++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
 
    }
}