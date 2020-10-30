package opg10_02_01_Ejendomsvurdering;

public class Bygning {
    private int areal;
    private int kvadratmeterpris;
    public Bygning(int areal, int kvadratmeterpris){
        this.areal = areal;
        this.kvadratmeterpris = kvadratmeterpris;
    }
    public int vurdering(){
        return areal * kvadratmeterpris;
    }
}