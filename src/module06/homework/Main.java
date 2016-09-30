package module06.homework;

import java.lang.reflect.Array;
import java.util.Arrays;

import static module06.homework.ArraysUtils.*;

/**
 * Created by Serg-fam on 25.09.2016 on 13:43.
 */
public class Main {
    public static void main(String[] args) {

        int[] arrays = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        User user1 = new User(10L, "User1", "User1Last", 100, 200);
        User user2 = new User(20L, "User2", "User2Last", 200, 300);
        User user3 = new User(30L, "User3", "User3Last", 300, 400);
        User user4 = new User(40L, "User4", "User41Last", 400, 500);
        User user5 = new User(50L, "User5", "User51Last", 500, 600);



        reverse(arrays);
        findEvenElements(arrays);
        sum(arrays);
    }
}
