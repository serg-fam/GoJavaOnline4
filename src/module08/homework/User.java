package module08.homework;

/**
 * Created by Serg-fam on 18.10.2016 on 11:45.
 */
public class User {

    private long id;
    private String name;

    public User() {

    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
