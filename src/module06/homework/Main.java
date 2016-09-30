package module06.homework;

import java.util.Arrays;

import static module06.homework.ArraysUtils.*;

/**
 * Created by Serg-fam on 25.09.2016 on 13:43.
 */
public class Main {
    public static void main(String[] args) {

        int[] arrays = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println(Arrays.toString(reverse(arrays)));
        findEvenElements(arrays);
        System.out.println();
        System.out.println(sum(arrays));

        User user1 = new User(20L, "User2", "User2Last", 200, 200);
        User user2 = new User(30L, "User3", "User3Last", 300, 400);
        User user3 = new User(40L, "User4", "User4Last", 400, 500);
        User user4 = new User(50L, "User5", "User5Last", 500, 600);
        User user5 = new User(0L, null, null, 0, 0);
        User user6 = new User(50L, "User5", "User5Last", 500, 600);

        User[] users = new User[]{user1, user2, user3, user4, user5, user6, user1, null};
        System.out.println(Arrays.toString(users) + "\n");
        users = UserUtils.deleteEmptyUsers(users);
        System.out.println(Arrays.toString(users) + "\n");
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)) + "\n");
        users = UserUtils.uniqueUsers(users);
        System.out.println(Arrays.toString(users) + "\n");
        users = UserUtils.paySalaryToUsers(users);
        System.out.println(Arrays.toString(users) + "\n");
        users = UserUtils.usersWithContitionalBalance(users, 400);
        System.out.println(Arrays.toString(users) + "\n");


    }
}
