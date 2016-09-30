package module02.homework04;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Serg-fam on 31.08.2016 on 16:01.
 */
public class Bank3 {

    static double[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static void main(String[] args) throws IOException {

        String ownerName = "Oww";
        double withdrawal = 100;

        System.out.println(Arrays.toString(balances));
        final double result = fund(ownerName, withdrawal);
        if (result < 0) {
            System.out.println(ownerName + " NO");
        } else {
            System.out.println(ownerName + " " + result);
        }
        System.out.println(Arrays.toString(balances));
    }

    static double fund(String ownerName, double fundAnmount) {

        final int balanceIndex = getBalanceIndexByName(ownerName);
        if (balanceIndex < 0) {
            return -1;
        }
        balances[balanceIndex] = fund(balances[balanceIndex], fundAnmount);
        return balances[balanceIndex];
    }

    private static int getBalanceIndexByName(String ownerName) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                return i;
            }
        }
        return -1;
    }

    private static double fund(double balance, double fund) {
        return balance + fund;
    }
}
