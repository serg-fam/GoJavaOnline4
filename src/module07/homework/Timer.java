package module07.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Serg-fam on 21.10.2016 on 16:41.
 */
public class Timer {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList();
        List<String> stringList = new ArrayList();
        List<Integer> integerLink = new LinkedList<>();
        List<String> stringLink = new LinkedList<>();

        long start = System.currentTimeMillis();


        for (int i = 0; i <= 1000; i++) {
            integerList.add(1000);
            stringList.add("1000");
            integerLink.add(1000);
            stringLink.add("1000");
        }
        long finish = System.currentTimeMillis();
      long result=(finish-start);
        System.out.println(result);

        for (int i = 0; i <= 10000; i++) {
            integerList.set(0, 10000);
            stringList.set(0, "10000");
            integerLink.set(0, 10000);
            stringLink.set(0, "10000");
        }

        for (int i = 0; i <= 1000; i++) {
            integerList.set(0, 1000);
            stringList.set(0, "1000");
            integerLink.set(0, 1000);
            stringLink.set(0, "1000");
        }

    }




}
