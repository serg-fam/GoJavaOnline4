package module07.homework.task04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Serg-fam on 21.10.2016 on 16:41.
 */
public class Timer {
    private static final int COUNT = 10000;

    public static void main(String[] args) {

        List<Integer> integerArrayList = new ArrayList();
        List<Integer> integerLinkedList = new LinkedList<>();
        List<String> stringArrayList = new ArrayList();
        List<String> stringLinkedListLink = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            integerArrayList.add(COUNT);
        }
        long finish = System.nanoTime();
        long result = finish - start;
        System.out.println("integerArrayList.add : " + result);

        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            integerLinkedList.add(COUNT);
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("integerLinkedList.add : " + result);

        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            stringArrayList.add("10000");
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("stringArrayList.add : " + result);

        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            stringLinkedListLink.add("10000");
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("stringLinkedListLink.add : " + result);

        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            integerArrayList.set(0, COUNT);
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("integerArrayList.set : " + result);
        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            integerLinkedList.set(0, COUNT);
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("integerLinkedList.set : " + result);

        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            stringArrayList.set(0, "10000");
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("stringArrayList.set : " + result);

        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            stringLinkedListLink.set(0, "10000");
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("stringLinkedListLink.set : " + result);

        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            integerArrayList.get(0);
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("integerArrayList.get : " + result);

        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            integerLinkedList.get(0);
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("integerLinkedList.get : " + result);

        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            stringArrayList.get(0);
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("stringArrayList.get : " + result);

        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            stringLinkedListLink.get(0);
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("stringLinkedListLink.get : " + result);

        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            integerArrayList.remove(0);
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("integerArrayList.remove : " + result);
        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            integerLinkedList.remove(0);
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("integerLinkedList.remove  : " + result);
        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            stringArrayList.remove(0);
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("stringArrayList.remove  : " + result);
        start = System.nanoTime();
        for (int i = 0; i <= COUNT; i++) {
            stringLinkedListLink.remove(0);
        }
        finish = System.nanoTime();
        result = finish - start;
        System.out.println("stringLinkedListLink.remove  : " + result);


    }
}
