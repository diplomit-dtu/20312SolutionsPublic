package opg10_01_02_DTU_Personer;

public class PersonOplysninger {
    public void personoplysninger(Person[] personer){

        for (Person person:personer){
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        Person[] personer = new Person[5];

        personer[0] = new Person("Brian");
        personer[1] = new Ansat("Børge", "Compute");
        personer[2]= new Studerende("Benny", "s134000");
        personer[3] = new Vip("Bente", "Fotonik",
                new String[]{"Indledende Programmering", "Test og Versionsstyring","Udviklingsmetoder"});
        personer[4] = new Tap("Bolette", "Elektro", 37);

        new PersonOplysninger().personoplysninger(personer);


    }
}
