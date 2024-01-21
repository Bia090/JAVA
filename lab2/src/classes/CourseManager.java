package classes;

import course.Course;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CourseManager {

    Course[] courses;

    public CourseManager()
    {

        courses = new Course[0];

    }

    public void addCourse(Course course)
    {

        int newLength = courses.length + 1;
        Course[] aux = new Course[newLength];
        int index = 0;
        for(Course c : courses)
        {
            aux[index++] = c;
        }

        aux[index] = course;

        this.courses = new Course[newLength];
        System.arraycopy(aux, 0 , courses, 0 , newLength);

    }

    public void displayCoursesToConsole()
    {
        for(Course c : courses)
        {

            System.out.println(c);

        }

    }

    //Ex2
    public void DynamicCourseEnroll(Course course, Student student)
    {

        course.addStudent(student);

    }

    //Ex3
    public List<Student> listStudentsInCourse(String courseName)
    {
        for(Course c : courses)
        {
            if(Objects.equals(c.name, courseName)) {
                List<Student> ListOfStudents = Arrays.asList(c.students);
                return ListOfStudents;
            }

        }
        return null;
    }

    //Ex4

    public int CalculateAverageGrade(Course course)
    {
        course.setAvarageGrade(0);
        for(Student s : course.students) {
            course.AverageGrade += s.courseGrades[course.CourseNumber];
        }

        return course.AverageGrade /= course.students.length;

    }

    public int CalculateAverageProfessorGrade(Professor prof)
    {
        int contor=0;

        int ProfessorAverageGrade = 0;

        for(Course c : courses)
        {

            if (c.teacher==prof) {

                ProfessorAverageGrade = ProfessorAverageGrade + CalculateAverageGrade(c);
                contor++;
            }

        }

        return ProfessorAverageGrade/contor;
    }

}