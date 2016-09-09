package module04.homework;

/**
 * Created by Serg-fam on 07.09.2016 on 15:56.
 */
public class EUBank extends Bank {

    public EUBank() {
    }

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 2000;
        else limit = 2200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 20000;
        else limit = 10000;
        return limit;
    }

     @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency() == Currency.USD) rate = 0;
        else rate = 1;
        return rate;
    }

    @Override
    int getCommission(int amount) {
        int commission = 0;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000) commission = 5;
            else commission = 7;
        } else {
            if (amount < 1000) commission = 2;
            else commission = 4;
        }
        return commission;
    }
}
