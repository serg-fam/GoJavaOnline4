package module08.homework;

import java.util.ArrayList;

/**
 * Created by Serg-fam on 16.10.2016 on 13:29.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        User user1 = new User();
        User user2 = new User(20L, "User2");
        User user3 = new User(50L, "User5");
        users.add(new User(10L, "User1"));
        users.add(new User(20L, "User2"));
        users.add(new User(30L, "User3"));
        users.add(user2);

        System.out.println(users);

        AbstractDAOImpl abstractDAO = new AbstractDAOImpl();

        abstractDAO.save(user1);
        abstractDAO.save(user2);
        abstractDAO.save(user3);
        abstractDAO.save(new User(40L, "User4"));
        //abstractDAO.delete(users);
        System.out.println("=================================================================================");
        abstractDAO.delete(user3);
        //   abstractDAO.saveAll(users);
        System.out.println(users);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        abstractDAO.delete(user1);
        abstractDAO.delete(user2);
        abstractDAO.delete(user3);
        abstractDAO.delete(users);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(users);
        abstractDAO.deleteAll(users);
        System.out.println(users);
        abstractDAO.getList(users);

    }
}
