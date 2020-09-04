package opgBonus04;

public class Min {
 public static double min(double a, double b, double c){
     //Using ternary operator instead of if-statement - intermediate level
     return a>c ? (b>c? c : b) : (b >a ? a : b);    
 }
}
