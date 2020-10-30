package opg10_02_02_Ejendomsvurdering2;

public class Grund {
    private int areal;
    private int kvadratmeterpris;
    private int byggeret;
    public Grund(int areal, int kvadratmeterpris, int byggeret){
        this.areal = areal;
        this.kvadratmeterpris = kvadratmeterpris;
        this.byggeret = byggeret;
    }
    public int vurdering(){
        return areal * kvadratmeterpris + byggeret;
    }
}