package courses;

import java.util.Arrays;
import java.util.Objects;

public class Student  extends Person {

    int groupNumber;

    int courseLength = 1;


    //Ex4
    int[] courseGrades = new int[100];

    public Student(String name, String surname, int groupNumber) {

        this.groupNumber = groupNumber;
        this.name = name;
        this.surname = surname;


    }


    //Ex4
    public void AddGrade(int grade)
    {

        courseGrades[courseLength] = grade;
        courseLength ++;

    }

    @Override
    public String toString() {
        return "Student{" +
                "groupNumber=" + groupNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Student() {

        this.groupNumber = 0;
        this.name = " ";
        this.surname = " ";

    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return groupNumber == student.groupNumber && courseLength == student.courseLength && Arrays.equals(courseGrades, student.courseGrades);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), groupNumber, courseLength);
        result = 31 * result + Arrays.hashCode(courseGrades);
        return result;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}