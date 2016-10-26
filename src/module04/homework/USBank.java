package module04.homework;

/**
 * Created by Serg-fam on 07.09.2016 on 15:55.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 1000;
        } else if (getCurrency() == Currency.EUR) {
            return 1200;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 10000;
        } else if (getCurrency() == Currency.USD) {
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return 1;
        } else if (getCurrency() == Currency.EUR) {
            return 2;
        }
        return 0;
        // пока не переделывал, здесь все понятно пока !да
    }

    @Override
    int getCommission(int amount) {
        if (getCurrency() == Currency.USD && amount <= 1000) {
            return 5;
        } else if (getCurrency() == Currency.USD && amount > 1000) {
            return 7;
        } else if (getCurrency() == Currency.EUR && amount <= 1000) {
            return 6;
        } else if (getCurrency() == Currency.EUR && amount > 1000) {
            return 8;
        }
        if (amount <= 1000) {
            return 10;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "USBank{" +
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


