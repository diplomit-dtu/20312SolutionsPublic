package opg11_02_Skrivning_til_fil2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFile {
    private BufferedWriter out;
    public void openFile(String file){
        try {
            out = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void writeInts(int[] ints){
        try {
            for(int i : ints) out.write(i+" ");
            out.newLine();
            out.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void closeFile(){
        try {
            if (out!=null)out.close();
        } catch (IOException e) {
        }
    }
    /** For testing only */
    public static void main(String[] args) {
        WriteFile writeFile = new WriteFile();
        writeFile.openFile("test");
        writeFile.writeInts(new int[]{1,2,3,4,5,6});
        writeFile.closeFile();
    }

}
/** To show how the same can be achieved with Java 8 */
class Java8WriteFile {
    private BufferedWriter file;

    public void openFile(String file){
        try {
            this.file = Files.newBufferedWriter(Paths.get(file), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeInts(int[] ints){
        try {
            for (int i : ints) {
                file.write(i + " ");
            }
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** For testing only */
    public static void main(String[] args) {
        Java8WriteFile java8WriteFile = new Java8WriteFile();
        java8WriteFile.openFile("test");
        java8WriteFile.writeInts(new int[]{1,2,3,4});
    }

}