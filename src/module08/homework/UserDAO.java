package module08.homework;

/**
 * Created by Serg-fam on 18.10.2016 on 15:14.
 */
public class UserDAO extends AbstractDAOImpl {
    User save(User user) {
        save(user);
        return user;
    }
}
