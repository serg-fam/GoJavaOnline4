package Module3.Homework.Task3;

import java.util.Arrays;

/**
 * Created by Serg-fam on 01.09.2016 on 12:10.
 */
class CollegeStudent extends Student {


    private String collegeName;


    private int rating;
    private long id;

    CollegeStudent(String firstName, String lastName, int group) {

        super(firstName, lastName, group);
    }

    CollegeStudent(String lastName, Course[] coursesTaken) {

        super(lastName, coursesTaken);
    }


    CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "CollegeStudent{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", group=" + getGroup() +
                ", coursesTaken=" + Arrays.toString(getCoursesTaken()) +
                ", age=" + getAge() +
                "collegeName='" + collegeName + '\'' +
                ", rating=" + rating +
                ", id=" + id +
                '}';
    }

}
