package opg11_01_Skrivning_fil_fil1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{5,6,7,8};
        int[][] arrays = new int[][]{arr1,arr2};

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("data.txt"));
            for (int[] arr: arrays){
                for (int i : arr){
                    out.write(i + " ");
                }
                out.write("\r\n");
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
