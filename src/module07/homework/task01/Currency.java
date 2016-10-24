package module07.homework.task01;

/**
 * Created by Serg-fam on 07.10.2016 on 16:43.
 */
public enum Currency {
    USD("840"),
    UAH("980");

    String number;

    Currency(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
