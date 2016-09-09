package module03.homework03;

import java.util.Arrays;

/**
 * Created by Serg-fam on 01.09.2016 on 12:11.
 */
class Student {

    private String firstName;


    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

    Student(String firstName, String lastName, int group) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;

    }

    Student(String lastName, Course[] coursesTaken) {

        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", coursesTaken=" + Arrays.toString(coursesTaken) +
                ", age=" + age +
                '}';
    }

}
