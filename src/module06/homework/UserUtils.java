package module06.homework;

import java.util.Arrays;

/**
 * Created by Serg-fam on 25.09.2016 on 13:30.
 */
public class UserUtils {

    User[] users;

    public UserUtils(User[] users) {
        this.users = users;
    }

    User[] uniqueUsers(User[] users) {


        for (User user : users) {

            if (user.equals(users)) {

                System.out.println("deleteuniqueUsers" + user);
            }
        }
        return users;
    }

    User[] usersWithContitionalBalance(User[] users, int balance) {

        for (User user : users) {
            if (user.getBalance() == balance) {
                System.out.println(user);
            }
        }
        return users;
    }

    final User[] paySalaryToUsers(User[] users) {

        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
            System.out.println(user);
        }
        return users;
    }

    final long[] getUsersId(User[] users) {

        for (User user : users) {
            System.out.print(user.getId()+ " ");
        }
        return new long[]{0L};
    }

    User[] deleteEmptyUsers(User[] users) {

        User userNull = new User(0L, null, null, 0, 0);

        for (User user : users) {

            if (user.equals(userNull)) {
                System.out.println("deleteEmptyUsers" + user);
            }
        }
        return users;
    }

    @Override
    public String toString() {
        return "UserUtils{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
