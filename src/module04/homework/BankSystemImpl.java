package module04.homework;

/**
 * Created by Serg-fam on 07.09.2016 on 15:59.
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        double amountWithCommission = getAmountWithCommision(amount, userBank);
        if (user.getBalance() < amountWithCommission) {
            System.out.println();
            return;
        }
        if (userBank.getLimitOfWithdrawal() < amountWithCommission) {
            System.out.println();
            return;
        }
        user.setBalance(user.getBalance() + amountWithCommission);
    }

    private int getAmountWithCommision(int amount, Bank userBank) {
        return amount + getSumCommision(amount, userBank);
    }

    private int getSumCommision(int amount, Bank userBank) {
        return amount * userBank.getCommission(amount) / 100;
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        if (userBank.getLimitOfFunding() < getAmountWithCommision(amount, userBank) + user.getBalance()) {
            System.out.println();
            return;
        }
        double newBalance = user.getBalance() + amount - getSumCommision(amount, userBank);
        user.setBalance(newBalance);
    }
    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        withdrawOfUser(fromUser, amount);
        fundUser(toUser, amount);
    }
    @Override
    public void paySalary(User user) {
        fundUser(user, user.getSalary());
    }
}
