package Module4.Homeworks.TasksAll;

/**
 * Created by Serg-fam on 07.09.2016 on 15:55.
 */
public class USBank extends Bank {

    public USBank() {
    }

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 10000;
        else limit = -1;
        return limit;
    }

    @Override
    int getMonthlyRate() {

        return 0;
    }

    @Override
    int getCommission() {

        return 0;
    }

}
