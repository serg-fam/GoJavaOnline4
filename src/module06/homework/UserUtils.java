package module06.homework;

import java.util.Arrays;

/**
 * Created by Serg-fam on 25.09.2016 on 13:30.
 */
public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        users = deleteEmptyUsers(users);
        User[] result = new User[0];
        for (User user : users) {
            boolean flac = !isContains(result, user);
            if (flac) {
                result = addUser(result, user);
            }
        }
        return result;
    }

    private static User[] addUser(User[] users, User user) {
        User[] result = Arrays.copyOf(users, users.length + 1);
        result[result.length - 1] = user;
        return result;
    }

    private static boolean isContains(User[] users, User user) {
        for (User key : users) {
            if (key.equals(user)) {
                return true;
            }
        }
        return false;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) { //ладно буду думать как сделать, весь мой код в топку

        users = uniqueUsers(users); //?
        User[] result = new User[0];
        for (User user : users) {
            if (user.getBalance() == balance) {
                result = addUser(result, user);
            }
        }
        return result;
    }

    static User[] paySalaryToUsers(User[] users) {
        users = uniqueUsers(users);
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
           // System.out.println(user);что то не так в методе
                    }
        return users;
    }

    static long[] getUsersId(User[] users) {
        users = uniqueUsers(users);
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            result[i] = users[i].getId();
        }
        return result;
    }

    static User[] deleteEmptyUsers(User[] users) {
        User[] result = new User[0];
        for (User user : users) {
            if (user != null) {
                result = addUser(result, user);
            }
        }
        return result;
    }
}
