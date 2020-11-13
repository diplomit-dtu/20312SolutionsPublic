package opg10_01_02_DTU_Personer;

public class Ansat extends Person {
    private String institutnavn;
    public Ansat(String navn, String institutnavn) {
        super(navn);
        this.institutnavn = institutnavn;
    }
    public String getInstitutnavn() {
        return institutnavn;
    }
    public void setInstitutnavn(String institutnavn) {
        this.institutnavn = institutnavn;
    }
    @Override
    public String toString() {
        return
                super.toString() +
                "\n\t[institutnavn="+institutnavn+"]";
    }
}