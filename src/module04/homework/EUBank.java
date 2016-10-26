package module04.homework;

/**
 * Created by Serg-fam on 07.09.2016 on 15:56.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 2000;
        } else if (getCurrency() == Currency.EUR) {
            return 2200;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        //  int limit;
        if (getCurrency() == Currency.EUR) {
            return 20000;
        } else if (getCurrency() == Currency.USD) {
            return 10000;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 0;
        } else if (getCurrency() == Currency.EUR) {
            return 1;
        }
        return 0;
    }

    @Override
    int getCommission(int amount) {
        if (getCurrency() == Currency.USD && amount <= 1000) {
            return 5;
        } else if (getCurrency() == Currency.USD && amount > 1000) {
            return 7;
        } else if (getCurrency() == Currency.EUR && amount <= 1000) {
            return 2;
        } else if (getCurrency() == Currency.EUR && amount > 1000) {
            return 4;
        }
        if (amount <= 1000) {
            return 10;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "EUBank{" +
                "id=" + getId() +
                ", bankCountry='" + getBankCountry() + '\'' +
                ", currency=" + getCurrency() +
                ", numberOfEmployees=" + getNumberOfEmployees() +
                ", avrSalaryOfEmployee=" + getAvrSalaryOfEmployee() +
                ", rating=" + getRating() +
                ", totalCapital=" + getTotalCapital() +
                '}';
    }
}
