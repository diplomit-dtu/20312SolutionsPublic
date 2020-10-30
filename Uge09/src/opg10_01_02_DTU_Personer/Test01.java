package opg10_01_02_DTU_Personer;

public class Test01 {

    public static void main(String[] args) {
        Person person = new Person("Brian");
        Ansat ansat = new Ansat("Børge", "Compute");
        Studerende studerende = new Studerende("Benny", "s134000");
        Vip vip = new Vip("Bente", "Fotonik",
                new String[]{"Indledende Programmering", "Test og Versionsstyring","Udviklingsmetoder"});
        Tap tap = new Tap("Bolette", "Elektro", 37);
        System.out.println(person);
        System.out.println(ansat);
        System.out.println(studerende);
        System.out.println(vip);
        System.out.println(tap);

    }

}
