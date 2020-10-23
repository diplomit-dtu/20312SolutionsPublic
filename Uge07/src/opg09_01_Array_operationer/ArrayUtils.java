package opg09_01_Array_operationer;
public class ArrayUtils {
    public static String arrayToString(int[] a) {
        String str = "{";
        for(int i=0; i<a.length; i++){
            str += a[i];
            if(i != a.length-1){str += " ";}
        }
        return str += "}";
    }
    public static int occurences(int[] a, int i) {
        int count = 0;
        for(int j : a){
            if(i == j){count++;}
        }
        return count;
    }
    public static int sum(int[] a) {
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }
}