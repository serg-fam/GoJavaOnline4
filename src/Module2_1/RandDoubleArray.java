package Module2_1;

import java.util.Random;

/**
 * Created by Serg-fam on 23.08.2016 on 9:26.
 */
public class RandDoubleArray {


    private static Random RandDouble;
    private static double[] doubleArray = new double[10];

     RandDoubleArray() {

        RandDouble = new Random(System.currentTimeMillis());

        for (int i = 0; i < 10; i++) {

            doubleArray[i] = RandDouble.nextInt(100) - 9.9;

            System.out.print(" " + doubleArray[i] + " ");

        }

    }

    public static double[] getDoubleArray() {
        return doubleArray;
    }

    public static void setDoubleArray(double[] doubleArray) {
        RandDoubleArray.doubleArray = doubleArray;
    }

}
