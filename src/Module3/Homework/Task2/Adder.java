package Module3.Homework.Task2;

/**
 * Created by Serg-fam on 01.09.2016 on 11:21.
 */
class Adder extends Arithmetic {

    boolean check(Integer a, Integer b) {

        if (a >= b) {

            System.out.println("(a >= b) True");

        } else {
            System.out.println("(a >= b) False");
        }

        return true;
    }
}