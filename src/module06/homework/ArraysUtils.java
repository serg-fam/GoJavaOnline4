package module06.homework;

import java.util.Arrays;

/**
 * Created by Serg-fam on 25.09.2016 on 13:30.
 */
public class ArraysUtils {

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

        for (int i = 1; i <=array.length; i++) {
            System.out.print(array[array.length - i] + (i == array.length ? " " : " , "));
        }
        return array;
    }


    static int[] findEvenElements(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + (i == array.length ? " " : " , "));
            }
        }
        return array;
    }


}
