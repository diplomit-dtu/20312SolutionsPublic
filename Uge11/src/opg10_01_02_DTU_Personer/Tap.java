package opg10_01_02_DTU_Personer;

public class Tap extends Ansat {
    private int arbejdstid;
    public Tap(String navn, String institutnavn, int arbejdstid) {
        super(navn, institutnavn);
        this.arbejdstid = arbejdstid;
    }
    @Override
    public String toString() {
        return
                super.toString() +
                "\n\t[arbejdstid="+arbejdstid+"]";
    }
}