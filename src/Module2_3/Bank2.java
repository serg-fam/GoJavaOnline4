package Module2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Serg-fam on 31.08.2016 on 15:16.
 */
public class Bank2 {

    static double[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    private static final double COMMISSION = 0.05;


    public static void main(String[] args) throws IOException {

        String a = "abc";
        String b = "abc";
        String c = new String("abc");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        final String ownerName = "Oleg";
        final double withdrawal = 450;

        System.out.println(Arrays.toString(balances));
        final double result = withdraw(ownerName, withdrawal);
        if (result < 0) {
            System.out.println(ownerName + " NO");
        } else {
            System.out.println(ownerName + " " + withdrawal + " " + result);
        }
        System.out.println(Arrays.toString(balances));
    }

    static double withdraw(String ownerName, double withdrawal) {
        final int balanceIndex = getBalanceIndexByName(ownerName);
        if (balanceIndex < 0) {
            return -1;
        }
        final double balance = balances[balanceIndex];
        final double result = withdrow(balance, withdrawal);
        if (result < 0) {
            return -1;
        }
        balances[balanceIndex] = result;
        return result;
    }

    private static int getBalanceIndexByName(String ownerName) {
        for(int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                return i;
            }
        }
        return -1;
    }

    private static double withdrow(double balance, double withdrowal) {
        return balance - withdrowal - getBankCommission(withdrowal);
    }

    private static double getBankCommission(double withdrowal) {
        return withdrowal * COMMISSION;
    }
}
