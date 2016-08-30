package Module2_1;


/**
 * Created by Serg-fam on 23.08.2016 on 11:35.
 */

public class MethodsArrays {


    int sum(int array[]) {

        int sum = array[0];

        for (int item : array) {

            sum += item;

        }

        System.out.print(" sum(int array[]): " + sum + ", ");
        return sum;
    }

    double sum(double array[]) {


        double sum = array[0];

        for (double item : array) {

            sum += item;
        }
        System.out.print(" sum(double[]): " + sum);

        return sum;
    }


    int min(int array[]) {


        int min = array[0];

        for (int item : array) {


            if (item < min) min = item;

        }

        System.out.print("min(int array[]): " + min + ", ");

        return min;

    }

    double min(double array[]) {

        double min = array[0];

        for (double item : array) {

            if (item < min) min = item;
        }

        System.out.print("min(double[]): " + min);

        return min;

    }

    int max(int array[]) {

        int max = array[0];

        for (int item : array) {


            if (item > max) max = item;

        }
        System.out.print("max(int array[]): " + max + ", ");
        return max;
    }

    double max(double array[]) {

        double max = array[0];

        for (double item : array) {

            if (item > max) max = item;
        }

        System.out.print("max(double[]): " + max);
        return max;

    }

    int maxPositive(int array[]) {

        int maxPositive = array[0];

        for (int item : array) {
            maxPositive = Math.max(item, maxPositive);


            if (item > maxPositive) maxPositive = item;

        }
        System.out.println("maxPositive(int array[]): " + maxPositive + ", ");
        return maxPositive;

    }

    double maxPositive(double array[]) {
        double maxPositive = array[0];

        for (double item : array) {

            maxPositive = Math.max(item, maxPositive);

            if (item > maxPositive) maxPositive = item;
        }
        System.out.println("maxPositive(double array[]): " + maxPositive);
        return maxPositive;
    }

    int multiplication(int array[]) {

        int multiplication = 1;

        for (int item : array) {

            multiplication *= item;


        }
        System.out.println(" multiplication  (int array[]): " + multiplication + ", ");
        return multiplication;
    }

    double multiplication(double array[]) {

        double multiplication = 1;

        for (double item : array) {

            multiplication *= item;

        }
        System.out.println("multiplication (double[]): " + multiplication);
        return multiplication;
    }

    int modulus(int array[]) {

        int modulus;
        int modulFirst = array[0];
        int modulLast = array[array.length - 1];


        modulus = modulFirst % modulLast;

        System.out.println("modulus(int array[]): " + modulus + ", ");
        return modulus;
    }

    double modulus(double array[]) {

        double modulus;
        double modulFirst = array[0];
        double modulLast = array[array.length - 1];

        modulus = modulFirst % modulLast;

        System.out.println("modulus(double[]): " + modulus);

        return modulus;
    }

    int secondLargest(int array[]) {

        int secondLargest = array[0];

        for (int i = array.length - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {

                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }
            System.out.print(array[i] + " ");

            secondLargest = array[8];
        }
        System.out.println();
        System.out.print("secondLargest(int array[]): " + secondLargest + ", ");
        return secondLargest;
    }

    double secondLargest(double array[]) {

        double secondLargest = array[0];

        for (int i = array.length - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {

                    double tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }
            System.out.print(array[i] + " ");

            secondLargest = array[8];
        }
        System.out.println();
        System.out.print("secondLargest(double[]): " + secondLargest + ".");
        return secondLargest;
    }


}







