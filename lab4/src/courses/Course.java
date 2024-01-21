package courses;

import java.util.*;

public class Course implements  CourseOperations {

    String name;
    String description;
    Professor teacher;

    int CourseNumber;

    //Ex4
    int AverageGrade;

    LinkedHashSet<Student> students;

    public Course(String name, String description, Professor teacher, LinkedHashSet<Student> students, int CourseNumber) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;

        this.students = new LinkedHashSet<>();
        this.students.addAll(students);

        Student[] sortedArray = new Student[this.students.size()];
        Iterator<Student> iterator = this.students.iterator();
        int index = 0;
        while (iterator.hasNext()) {

            sortedArray[index] = iterator.next();

            index++;
        }



        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i].groupNumber > sortedArray[j].groupNumber) {


                    Student temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }


        this.students.clear();
        Collections.addAll(this.students, sortedArray);


        this.CourseNumber = CourseNumber;

    }

    public Course() {

        this.name = " ";
        this.description = " ";
        this.teacher = null;
        this.students = null;
        this.CourseNumber = 0;

    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Course: " + "name=" + name + ", description=" + description + ".\nTeacher=" + teacher + "AverageGrade=" + AverageGrade + ".\nStudents:\n");
        for(Student s : students)
        {

            str.append(s).append("\n");

        }

        return str.toString();

    }

    public void setAverageGrade(int averageGrade) {
        AverageGrade = averageGrade;
    }

    @Override
    public void UpdateProfessor(Professor p) {

    }

    @Override
    public void AddStudent(Student student) {

        students.add(student);
        Student[] sortedArray = new Student[this.students.size()];
        Iterator<Student> iterator = this.students.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            sortedArray[index] = iterator.next();
            index++;
        }



        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i].groupNumber > sortedArray[j].groupNumber) {

                    Student temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }


        this.students.clear();
        Collections.addAll(this.students, sortedArray);




    }


    @Override
    public void UpdateStudent(Student student) {


    }

    @Override
    public void UpdateCourse(String name, String description) {

        this.name = name;
        this.description = description;

    }


    @Override
    public void RemoveStudent(Student student) {

        students.remove(student);

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return CourseNumber == course.CourseNumber && AverageGrade == course.AverageGrade && Objects.equals(name, course.name) && Objects.equals(description, course.description) && Objects.equals(teacher, course.teacher) && Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, teacher, CourseNumber, AverageGrade, students);
    }


}