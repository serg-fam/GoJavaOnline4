package Module2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg-fam on 31.08.2016 on 15:16.
 */
public class Bank2 {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ownerNames:{\"Jane\", \"Ann\", \"Jack\", \"Oww\", \"Lane\"}: ");

        String names = reader.readLine();

        System.out.println("withdrawal:");

        double withdraw = Double.parseDouble(reader.readLine());

        withdrawBalance(names, withdraw);
    }

    static double withdrawBalance(String ownerName, double withdrawal) {

        String name;
        int indexBalance;
        double withdrawBalance = 0;

        for (int i = 0; i < ownerNames.length; i++) {

            if (ownerName.equals(ownerNames[i])) {

                name = ownerNames[i];

                for (int j = 0; j < balances.length; j++) {

                    if (i == j) {
                        indexBalance = balances[j];

                        if (indexBalance >= (withdrawal + 0.5)) {

                            withdrawBalance = (indexBalance - (withdrawal + 0.5));

                            System.out.println(name + " " + indexBalance + " " + withdrawBalance);

                        } else {

                            System.out.println(ownerName + "NO money!");
                        }

                    }
                }
            }
        }

        return withdrawBalance;
    }
}
