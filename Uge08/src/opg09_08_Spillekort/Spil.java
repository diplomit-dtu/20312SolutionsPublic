package opg09_08_Spillekort;
import java.util.Arrays;
import java.util.Random;

public class Spil {
    private Kort[] kort;
    public Spil() {
        kort= new Kort[52];
        inispil();
    }

    private void inispil(){
        // hjælpemetode der initialiserer kort
        for (int i = 0; i<4; i++){
            char farve;
            switch (i){
                case 0:
                    farve = 'S';
                    break;
                case 1:
                    farve = 'H';
                    break;
                case 2:
                    farve = 'R';
                    break;
                default:
                    farve ='K';
                    break;
            }
            for (int j = 0; j<13; j++){
                kort[i*13+j] = new Kort(farve,j);
            }
        }
    }

    public Kort traekkort(){
        Kort trukket = kort[0];
        for (int i = 0; i<kort.length-1;i++){
            kort[i] = kort[i+1];
        }
        kort[kort.length-1]= trukket;
        return trukket;
    }

    public void blandkort(){

        Random random = new Random();

        // Løsning 1
        int index;
        Kort temp;

//        for (int i = kort.length - 1; i > 0; i--)
//        {
//            index = random.nextInt(i + 1);
//            temp = kort[index];
//            kort[index] = kort[i];
//            kort[i] = temp;
//        }

        // Løsning 2
        for(int i = 0; i < 1000000; i++) {
            int index1 = random.nextInt(52);
            int index2 = random.nextInt(52);
            if (!(index1 == index2)) {
                Kort random1 = kort[index1];
                Kort random2 = kort[index2];

                kort[index1] = random2;
                kort[index2] = random1;
            }
        }

        // alternativt kan javas Collections api bruges
            // Collections.shuffle(Arrays.asList(kort));
    }

    //TO-DO: Denne skal kodes om så der ikke anvendes Arrays klassen
//    public String toString(){
//        return Arrays.asList(kort).toString();
//    }

    public String toString(){
        String out = "";
        for (int i=0;(i<kort.length);i++)
            out = out + (kort[i]+ " \n");
        return out;
    }
}
