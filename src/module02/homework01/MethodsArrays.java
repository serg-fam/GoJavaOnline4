package module02.homework01;

import java.util.Arrays;

/**
 * Created by Serg-fam on 23.08.2016 on 11:35.
 */

class MethodsArrays {

    private RandIntArray randIntArray = new RandIntArray();
    private RandDoubleArray randDoubleArray = new RandDoubleArray();

    private int[] randIntArrays = randIntArray.getIntArray();
    private double[] randDoubleArrays = randDoubleArray.getDoubleArray();

    private int sum(int[] array) {
        int sum = array[0];
        for (int item : array) {
            sum += item;
        }
        return sum;
    }


    private double sum(double[] array) {
        double sum = array[0];
        for (double item : array) {
            sum += item;
        }
        return sum;
    }


    private int min(int[] array) {
        int min = array[0];
        for (int item : array) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    private double min(double[] array) {
        double min = array[0];
        for (double item : array) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    private int max(int[] array) {
        int max = array[0];
        for (int item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    private double max(double[] array) {
        double max = array[0];
        for (double item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    private int maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int item : array) {
            maxPositive = Math.max(item, maxPositive);
            if (item > maxPositive) {
                maxPositive = item;
            }
        }
        return maxPositive;
    }

    private double maxPositive(double[] array) {
        double maxPositive = array[0];
        for (double item : array) {
            maxPositive = Math.max(item, maxPositive);
            if (item > maxPositive) {
                maxPositive = item;
            }
        }
        return maxPositive;
    }

    private int multiplication(int[] array) {

        int multiplication = 1;

        for (int item : array) {
            multiplication *= item;
        }
        return multiplication;
    }

    private double multiplication(double[] array) {

        double multiplication = 1;

        for (double item : array) {
            multiplication *= item;
        }
        return multiplication;
    }

    private int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    private double modulus(double[] array) {
        return array[0] % array[array.length - 1];
    }

    private int secondLargest(int[] array) {
        int max = max(array);
        int secondLargest = Integer.MIN_VALUE;
        for (int item : array) {
            if (item > secondLargest && item < max) {
                secondLargest = item;
            }
        }
        return secondLargest;
    }

    private double secondLargest(double[] array) {
        double max = max(array);
        double secondLargest = Double.MIN_VALUE;
        for (double item : array) {
            if (item > secondLargest && item < max)
                secondLargest = item;
        }
        return secondLargest;
    }

    private int sumInt = sum(randIntArrays);
    private double sumDouble = sum(randDoubleArrays);
    private int minInt = min(randIntArrays);
    private double minDouble = min(randDoubleArrays);
    private int maxInt = max(randIntArrays);
    private double maxDouble = max(randDoubleArrays);
    private int maxIntPositive = maxPositive(randIntArrays);
    private double maxDoublePositive = maxPositive(randDoubleArrays);
    private int multiplicationInt = multiplication(randIntArrays);
    private double multiplicationDouble = multiplication(randDoubleArrays);
    private int modulusInt = modulus(randIntArrays);
    private double modulusDouble = modulus(randDoubleArrays);
    private int secondLargestInt = secondLargest(randIntArrays);
    private double secondLargestDouble = secondLargest(randDoubleArrays);

    @Override
    public String toString() {
        return "Output:" + '\n' +
                " randIntArrays=" + Arrays.toString(randIntArrays) + '\n' +
                " randDoubleArrays=" + Arrays.toString(randDoubleArrays) + '\n' +
                " sumInt=" + sumInt + '\n' +
                " sumDouble=" + sumDouble + '\n' +
                " minInt=" + minInt + '\n' +
                " minDouble=" + minDouble + '\n' +
                " maxInt=" + maxInt + '\n' +
                " maxDouble=" + maxDouble + '\n' +
                " maxIntPositive=" + maxIntPositive + '\n' +
                " maxDoublePositive=" + maxDoublePositive + '\n' +
                " multiplicationInt=" + multiplicationInt + '\n' +
                " multiplicationDouble=" + multiplicationDouble + '\n' +
                " modulusInt=" + modulusInt + '\n' +
                " modulusDouble=" + modulusDouble + '\n' +
                " secondLargestInt=" + secondLargestInt + '\n' +
                " secondLargestDouble=" + secondLargestDouble +
                '.';
    }
}










