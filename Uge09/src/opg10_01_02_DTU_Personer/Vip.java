package opg10_01_02_DTU_Personer;

public class Vip extends Ansat {
    private String[] kurser;
    public Vip(String navn, String institutnavn, String[] kurser) {
        super(navn, institutnavn);
        this.kurser = kurser;
    }
    public String[] getKurser() {
        return kurser;
    }
    public void setKurser(String[] kurser) {
        this.kurser = kurser;
    }
    @Override
    public String toString() {
        String str = super.toString(); 
        for (String kursus : kurser) {
            str+="\n\t[kursus="+kursus+"]";
        };
        return str;
    }
}