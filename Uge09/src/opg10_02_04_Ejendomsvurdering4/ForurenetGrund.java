package opg10_02_04_Ejendomsvurdering4;

import opg10_02_02_Ejendomsvurdering2.Grund;

public class ForurenetGrund extends Grund {
    private int fradrag;
 
    public ForurenetGrund(int areal, int kvadratmeterpris,
            int byggeret, int fradrag) {
        super(areal, kvadratmeterpris, byggeret);
        this.fradrag = fradrag;
    }
    @Override
    public int vurdering() {
        return super.vurdering() - fradrag;
    }
    public void saetFradrag(int fradrag){
        this.fradrag = fradrag;
    }
}