package opg10_01_02_DTU_Personer;

public class Test01 {

    public static void main(String[] args) {
        Person p = new Person("Brian");
        Person ansat = new Ansat("Børge", "Compute");
        Person studerende = new Studerende("Benny", "s134000");
        Ansat vip = new Vip("Bente", "Fotonik",
                new String[]{"Indledende Programmering", "Test og Versionsstyring","Udviklingsmetoder"});
        Ansat tap = new Tap("Bolette", "Elektro", 37);
        System.out.println(p);
        System.out.println(ansat);
        System.out.println(studerende);
        System.out.println(vip);
        System.out.println(tap);

    }

}
