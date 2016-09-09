package module03.homework03;

import java.util.Date;

/**
 * Created by Serg-fam on 01.09.2016 on 12:10.
 */
public class Main {
    public static void main(String[] args) {

        Course One = new Course("One", 100, "Teacher1");
        System.out.println(One.toString());
        System.out.println();
        Course Two = new Course("Two", 200, "Teacher2");
        System.out.println(Two.toString());
        System.out.println();
        Course Tree = new Course("Tree", 250, "Teacher3");
        System.out.println(Tree.toString());
        System.out.println();
        Course Four = new Course("Four", 270, "Teacher4");
        System.out.println(Four.toString());
        System.out.println();
        Course Dat = new Course(new Date(), "Data");
        System.out.println(Dat.toString());
        System.out.println();
        Student student1 = new Student("Student1", "One", 1);
        System.out.println(student1.toString());
        System.out.println();
        Student student2 = new Student("Student2", new Course[]{One, Two, Tree, Four, Dat});
        System.out.println(student2.toString());
        System.out.println();
        CollegeStudent collegeStudent1 = new CollegeStudent("CollegeStudent1", "One", 1);
        System.out.println(collegeStudent1.toString());
        System.out.println();
        CollegeStudent collegeStudent2 = new CollegeStudent("Two", new Course[]{One, Two, Tree, Four, Dat});
        System.out.println(collegeStudent2.toString());
        System.out.println();
        CollegeStudent collegeStudent3 = new CollegeStudent("CollegeStudent3", "Tree", 3, "CollegeTree", 3, 3054);
        System.out.println(collegeStudent3.toString());
        System.out.println();
        SpecialStudent specialStudent1 = new SpecialStudent("SpecialStudent1", "One", 1);
        System.out.println(specialStudent1.toString());
        System.out.println();
        SpecialStudent specialStudent2 = new SpecialStudent("SpecialStudent2", "Two", 2, "CollegeTwo", 2, 2028);
        System.out.println(specialStudent2.toString());
        System.out.println();
        SpecialStudent specialStudent3 = new SpecialStudent("SpecialStudent3", "Tree", 3, "CollegeTree", 3, 3028, 301234);
        System.out.println(specialStudent3.toString());
    }


}
