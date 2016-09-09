package module04.homework;

/**
 * Created by Serg-fam on 07.09.2016 on 15:56.
 */
public class ChinaBank extends Bank {

    public ChinaBank() {
    }

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 100;
        else limit = 150;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 5000;
        else limit = 10000;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency() == Currency.USD) rate = 10;
        else rate = 0;
        return rate;
    }

    @Override
    int getCommission(int amount) {
        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000) commission = 3;
            else commission = 5;
        } else {
            if (amount < 1000) commission = 10;
            else commission = 11;
        }
        return commission;
    }
}