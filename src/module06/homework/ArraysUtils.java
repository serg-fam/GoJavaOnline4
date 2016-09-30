package module06.homework;

import java.util.Arrays;

/**
 * Created by Serg-fam on 25.09.2016 on 13:30.
 */
public final class ArraysUtils {

    static int sum(int array[]) {
        int sum = array[0];
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    static int min(int array[]) {
        int min = array[0];
        for (int item : array) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    static int max(int array[]) {
        int max = array[0];
        for (int item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    static int maxPositive(int array[]) {
        int maxPositive = array[0];
        for (int item : array) {
            maxPositive = Math.max(item, maxPositive);
            if (item > maxPositive) {
                maxPositive = item;
            }
        }
        return maxPositive;
    }

    static int multiplication(int array[]) {
        int multiplication = 1;
        for (int item : array) {
            multiplication *= item;
        }
        return multiplication;
    }

    static int modulus(int array[]) {
        return array[0] % array[array.length - 1];
    }

    static int secondLargest(int array[]) {
        int max = max(array);
        int secondLargest = Integer.MIN_VALUE;
        for (int item : array) {
            if (item > secondLargest && item < max) {
                secondLargest = item;
            }
        }
        return secondLargest;
    }

    static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int index2 = array.length - 1 - i;
            swap(array, i, index2);
        }
        return array;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static int[] findEvenElements(int[] array) {
        int[] result = new int[0];
        for (int value : array) {
            if (value % 2 == 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = value;
            }
        }
        return result;
    }


}
