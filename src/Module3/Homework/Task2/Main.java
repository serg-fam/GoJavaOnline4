package Module3.Homework.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg-fam on 01.09.2016 on 11:20.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Integer a, b;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Integer a:");

        a = Integer.parseInt(reader.readLine());

        System.out.println("Integer b:");

        b = Integer.parseInt(reader.readLine());


        Arithmetic arithmetic = new Arithmetic();
        arithmetic.add(a, b);
        Adder adder = new Adder();
        adder.check(a, b);
    }
}
