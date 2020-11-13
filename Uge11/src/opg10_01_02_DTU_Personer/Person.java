package opg10_01_02_DTU_Personer;

public class Person {
    private String navn;
    public Person(String navn) {
        this.navn = navn;
    }
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }
    @Override //overskriver Object-klassens toString
    public String toString() {
        return this.getClass() + "\n\t[navn="+navn+"]";
    }
}