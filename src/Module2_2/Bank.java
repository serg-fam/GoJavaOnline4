package Module2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg-fam on 30.08.2016 on 9:04.
 */

public class Bank {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static void main(String[] args) throws IOException {

        String name;
        int indexName;
        int indexBalance = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ownerNames:{\"Jane\", \"Ann\", \"Jack\", \"Oww\", \"Lane\"}: ");

        String names = reader.readLine();

        for (int i = 0; i < ownerNames.length; i++) {

            if (names.equals(ownerNames[i])) {

                name = names;

                indexName = i;

                System.out.println(" ownerNames: " + name);

                System.out.println("Index: " + indexName);


                for (int j = 0; j < balances.length; j++) {

                    if (i == j) {
                        indexBalance = balances[j];

                        System.out.println("balance " + name + " : " + indexBalance);
                    }
                }
            }
        }

        System.out.println("withdrawal:");


        double withdrawal = Double.parseDouble(reader.readLine());

        withdrawBalance(indexBalance, withdrawal);


    }

    static double withdrawBalance(double balance, double withdrawal) {

        double withdrawBalance = 0;

        if (balance > (withdrawal + 0.5)) {

            withdrawBalance = (balance - (withdrawal + 0.5));

            System.out.println("OK " + withdrawal + " withdrawBalance: " + withdrawBalance);

        } else {

            System.out.println("NO money!");
        }

        return withdrawBalance;
    }
}


