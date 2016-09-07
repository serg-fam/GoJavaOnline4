package Module4.Homeworks.TasksAll;

/**
 * Created by Serg-fam on 07.09.2016 on 15:56.
 */
public enum Currency {

    USD("840"),
    EUR("978");

    String number;

    Currency(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

}

