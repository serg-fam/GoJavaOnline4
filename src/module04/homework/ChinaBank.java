package module04.homework;

/**
 * Created by Serg-fam on 07.09.2016 on 15:56.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 100;
        } else if (getCurrency() == Currency.EUR) {
            return 150;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 5000;
        } else if (getCurrency() == Currency.USD) {
            return 10000;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1;
        } else if (getCurrency() == Currency.EUR) {
            return 0;
        }
        return 0;
    }

    @Override
    int getCommission(int amount) {
        if (getCurrency() == Currency.USD && amount <= 1000) {
            return 3;
        } else if (getCurrency() == Currency.USD && amount > 1000) {
            return 5;
        } else if (getCurrency() == Currency.EUR && amount <= 1000) {
            return 10;
        } else if (getCurrency() == Currency.EUR && amount > 1000) {
            return 11;
        }
        if (amount <= 1000) {
            return 10;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "ChinaBank{" +
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
