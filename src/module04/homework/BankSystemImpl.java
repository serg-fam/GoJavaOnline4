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

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        double commission = userBank.getCommission(amount) / 100;
        if (userBank.getLimitOfWithdrawal() >= 0) {
            double newBalance = user.getBalance() + amount - amount * commission;
            user.setBalance(newBalance);
        } else {
            System.out.println("No do nothing");
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank userBankFrom = fromUser.getBank();
        double commission = userBankFrom.getCommission(amount) / 100;
        double transferFromUser = fromUser.getBalance() - amount - amount * commission;
        double transferToUser = toUser.getBalance() + amount - amount * commission;
        fromUser.setBalance(transferFromUser);
        toUser.setBalance(transferToUser);
    }

    @Override
    public void paySalary(User user) {
        Bank userBank = user.getBank();
        double commission = userBank.getCommission(user.getSalary() / 100);
        double newBalance = user.getBalance() + user.getSalary() - commission;
        user.setBalance(newBalance);
    }

}
