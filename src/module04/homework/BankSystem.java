package module04.homework;

/**
 * Created by Serg-fam on 07.09.2016 on 15:58.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);

}
