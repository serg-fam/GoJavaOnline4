package Module2_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg-fam on 31.08.2016 on 16:01.
 */
public class Bank3 {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ownerNames:{\"Jane\", \"Ann\", \"Jack\", \"Oww\", \"Lane\"}: ");

        String names = reader.readLine();

        System.out.println("withdrawal:");

        double withdraw = Double.parseDouble(reader.readLine());

        fundBalance(names, withdraw);
    }

    static double fundBalance(String ownerName, double fund) {

        String name;
        int indexBalance;
        double fundBalance = 0;

        for (int i = 0; i < ownerNames.length; i++) {

            if (ownerName.equals(ownerNames[i])) {

                name = ownerNames[i];

                for (int j = 0; j < balances.length; j++) {

                    if (i == j) {
                        indexBalance = balances[j];

                        fundBalance = (indexBalance + fund);

                        balances[j] = ((int) fundBalance);

                        System.out.println(name + " " + fundBalance);

                    }
                }
            }
        }
        return fundBalance;
    }

}


