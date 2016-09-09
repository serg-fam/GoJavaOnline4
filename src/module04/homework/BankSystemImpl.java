package module04.homework;

/**
 * Created by Serg-fam on 07.09.2016 on 15:59.
 */
public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        double commission = userBank.getCommission(amount) / 100;
        if (userBank.getLimitOfWithdrawal() >= amount + amount * commission) {
            double newBalance = user.getBalance() - amount - amount * commission;
            user.setBalance(newBalance);
        }
    }

    public void fundUser(User user, int amount) {

    }

    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    public void paySalary(User user) {


    }

}
