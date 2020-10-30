package opg10_02_03_Ejendomsvurdering3;

import opg10_02_01_Ejendomsvurdering.Bygning;
import opg10_02_02_Ejendomsvurdering2.Grund;

public class Ejendom{
    private Bygning bygning;
    private Grund grund;
    public Ejendom(Bygning bygning, Grund grund){
        this.bygning = bygning; this.grund = grund;
    }
    public int vurdering(){
        return bygning.vurdering() + grund.vurdering();
    }
}
