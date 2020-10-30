package opg10_02_03_Ejendomsvurdering3;

import opg10_02_01_Ejendomsvurdering.Bygning;
import opg10_02_02_Ejendomsvurdering2.Grund;

public class Vurdering {
    public static void main(String[] args)
    {
        Ejendom k29 = new Ejendom(
                new Bygning(200,800),
                new Grund(800,500,400000));
        Ejendom a11 =new Ejendom(new Bygning( 70, 4000), new Grund(700, 30, 24000));
        Ejendom[] ejendomme = { k29, a11 };
        System.out.println(vurdering(ejendomme));

    }

    private static int vurdering(Ejendom[] ejd) {
        int sum = 0;
        for (Ejendom e: ejd)
        {
            sum+=e.vurdering();
        }
        return sum;
    }
}
