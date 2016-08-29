package Module2_1;

import java.util.Random;

/**
 * Created by Serg-fam on 23.08.2016 on 9:26.
 */
public class RandIntArray {

    private static Random RandInt;
    private static int[] intArray = new int[10];


    RandIntArray() {


        RandInt = new Random(System.currentTimeMillis());

        for (int i = 0; i < intArray.length; i++) {

            intArray[i] = (RandInt.nextInt(100) - 10);

            System.out.print(" " + intArray[i] + " ");

        }

    }

    public static int[] getIntArray() {
        return intArray;
    }

    public static void setIntArray(int[] intArray) {
        RandIntArray.intArray = intArray;
    }
}
