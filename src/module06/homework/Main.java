package module06.homework;

import static module06.homework.ArraysUtils.*;

/**
 * Created by Serg-fam on 25.09.2016 on 13:43.
 */
public class Main {
    public static void main(String[] args) {

        int[] arrays = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        User[] users = new User[]{new User(10L, "User1", "User1Last", 100, 200),
                new User(20L, "User2", "User2Last", 200, 200),
                new User(30L, "User3", "User3Last", 300, 400),
                new User(40L, "User4", "User4Last", 400, 500),
                new User(50L, "User5", "User5Last", 500, 600),
                new User(0L, null, null, 0, 0),
                new User(50L, "User5", "User5Last", 500, 600)};

        UserUtils userUtils = new UserUtils(users);

        userUtils.uniqueUsers(users);
        System.out.println();
        userUtils.usersWithContitionalBalance(users, 200);
        System.out.println();
        userUtils.paySalaryToUsers(users);
        System.out.println();
        userUtils.getUsersId(users);
        System.out.println();
        userUtils.deleteEmptyUsers(users);

        reverse(arrays);
        System.out.println();
        findEvenElements(arrays);
        System.out.println();
        System.out.println(sum(arrays));
    }
}
