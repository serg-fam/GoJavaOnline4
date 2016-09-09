package module03.homework03;

import java.util.Date;

/**
 * Created by Serg-fam on 01.09.2016 on 12:11.
 */
class Course {

    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "startDate=" + startDate +
                ", name='" + name + '\'' +
                ", hoursDuration=" + hoursDuration +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}

