package opg06_01_Punkter;

public class Tests {

    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,1);
        ///Test
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));


        ///Test
        //p1.move(1, 1);
        p1=p2;
        //p1.ligmed(p2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        ///EOT

    }

}
