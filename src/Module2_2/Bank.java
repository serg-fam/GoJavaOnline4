package Module2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg-fam on 31.08.2016 on 15:16.
 */
public class Bank {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    private static final double COMMISSION = 0.05;

    public static void main(String[] args) throws IOException {

        double balance = 100;
        double withdrowal = 10;

        double result = withdrow(balance, withdrowal);
        if (result < 0) {
            System.out.println("NO");
        } else {
            System.out.println("OK " + getBankCommission(withdrowal) + " " + result);
        }

    }

    private static double withdrow(double balance, double withdrowal) {
        return balance - withdrowal - getBankCommission(withdrowal);
    }

    private static double getBankCommission(double withdrowal) {
        return withdrowal * COMMISSION;
    }
}
