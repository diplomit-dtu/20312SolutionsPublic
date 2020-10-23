package opg09_08_Spillekort;

public class Kort{
    private char farve; // S,H,R,K
    private int vaerdi; // 0 til 12

    public Kort (char farve,int vaerdi)	{
        this.farve = farve;
        this.vaerdi = vaerdi;
    }

    public String toString() {
        String s = "";
        switch (farve) {
            case 'S':
                s+= "Spar ";
                break;
            case 'H':
                s+= "Hjerter ";
                break;
            case 'R':
                s+= "Ruder ";
                break;
            case 'K':
                s+= "Klør ";
                break;
        }
        switch (vaerdi){
            case 0:
                s+= "Es";
                break;
            case 10:
                s+= "Knægt";
                break;
            case 11:
                s+= "Dame";
                break;
            case 12:
                s+= "Konge";
                break;
            default:
                s+= vaerdi+1;
                break;
        }

        return s;
    }

    /**
     * Test main
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Kort('H',12));
        System.out.println(new Kort('S',0));
        System.out.println(new Kort('K',1));
        System.out.println(new Kort('R',9));
    }
}
