package Module2_1;


/**
 * Created by Serg-fam on 23.08.2016 on 11:35.
 */

public class MethodsArrays {


    int sum(int array[]) {

        int sumInt = 0;

        for (int i = 0; i < array.length; i++) {

            sumInt += array[i];

        }

        System.out.print(" sum(int array[]): " + sumInt + ", ");
        return sumInt;
    }

    double sum(double array[]) {


        double sumDouble = 0.0;

        for (int i = 0; i < array.length; i++) {

            sumDouble += array[i];
        }
        System.out.print(" sum(double[]): " + sumDouble);

        return sumDouble;
    }


    int min(int array[]) {


        int minInt = 0;

        for (int i = 0; i < array.length; i++) {

            minInt = Math.min(array[i], minInt);

            if (array[i] == minInt) ;// minInt = array[i];

        }

        System.out.print("min(int array[]): " + minInt + ", ");

        return minInt;

    }

    double min(double array[]) {

        double minDouble = 0.0;

        for (int i = 0; i < array.length; i++) {

            minDouble = Math.min(array[i], minDouble);

            if (array[i] == minDouble) ; // minDouble = array[i];
        }

        System.out.print("min(double[]): " + minDouble);

        return minDouble;

    }

    int max(int array[]) {

        int maxInt = 0;

        for (int i = 0; i < array.length; i++) {

            maxInt = Math.max(array[i], maxInt);

            if (array[i] == maxInt) ;// maxInt = array[i];

        }
        System.out.print("max(int array[]): " + maxInt + ", ");
        return maxInt;
    }

    double max(double array[]) {

        double maxDouble = 0.0;

        for (int i = 0; i < array.length; i++) {

            maxDouble = Math.max(array[i], maxDouble);

            if (array[i] == maxDouble) ;// maxDouble = array[i];
        }

        System.out.print("max(double[]): " + maxDouble);
        return maxDouble;

    }

    int maxPositive(int array[]) {

        int maxPos = 0;

        for (int i = 0; i < array.length; i++) {
            maxPos = Math.max(array[i], maxPos);


            if (array[i] > maxPos) ;

        }
        System.out.println("maxPositive(int array[]): " + maxPos + ", ");
        return maxPos;

    }

    double maxPositive(double array[]) {
        double maxPos = 0.0;

        for (int i = 0; i < array.length; i++) {

            maxPos = Math.max(array[i], maxPos);

            if (array[i] > maxPos) ;
        }
        System.out.println("maxPositive(double array[]): " + maxPos);
        return maxPos;
    }

    int multiplication(int array[]) {

        int multInt = 1;

        for (int i = 0; i < array.length; i++) {

            multInt *= array[i];


        }
        System.out.println(" multiplication  (int array[]): " + multInt + ", ");
        return multInt;
    }

    double multiplication(double array[]) {

        double multDouble = 1;

        for (int i = 0; i < array.length; i++) {

            multDouble *= array[i];

        }
        System.out.println("multiplication (double[]): " + multDouble);
        return multDouble;
    }

    void modulus(int array[]) {

        int modulFirst = 0;
        int modulLast = 0;
        for (int i = 0; i < array.length; i++) {

            modulFirst = array[0] % 10;
            modulLast = array[array.length - 1] % 10;


        }
        System.out.println("modulus(int array[]): " + modulFirst + "  " + modulLast + ", ");

    }

    void modulus(double array[]) {

        double modulFirst = 0.0;
        double modulLast = 0.0;

        for (int i = 0; i < array.length; i++) {

            modulFirst = array[0] % 10;
            modulLast = array[array.length - 1] % 10;

        }
        System.out.println("modulus(double[]): " + modulFirst + "  " + modulLast);

    }

    int secondLargest(int array[]) {

        int secondIntL = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {

                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }
            System.out.print(array[i] + " ");

            secondIntL = array[8];
        }
        System.out.println();
        System.out.print("secondLargest(int array[]): " + secondIntL + ", ");
        return secondIntL;
    }

    double secondLargest(double array[]) {

        double secondIntL = 0.0;

        for (int i = array.length - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {

                    double tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }
            System.out.print(array[i] + " ");

            secondIntL = array[8];
        }
        System.out.println();
        System.out.print("secondLargest(double[]): " + secondIntL + ".");
        return secondIntL;
    }


}







