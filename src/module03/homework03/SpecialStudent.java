package module03.homework03;

import java.util.Arrays;

/**
 * Created by Serg-fam on 01.09.2016 on 12:11.
 */
class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group, collegeName, rating, id);
    }

    SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id, long secretKey) {
        super(firstName, lastName, group, collegeName, rating, id);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SpecialStudent{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", group=" + getGroup() +
                ", coursesTaken=" + Arrays.toString(getCoursesTaken()) +
                ", age=" + getAge() +
                "collegeName='" + getCollegeName() + '\'' +
                ", rating=" + getRating() +
                ", id=" + getId() +
                "secretKey=" + secretKey +
                '}';
    }
}
