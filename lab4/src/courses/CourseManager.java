package courses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CourseManager implements ISourceManager {

    List<Course> courses;

    public CourseManager()
    {

        courses = new ArrayList<>();


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

        course.AddStudent(student);



    }


    //Studentii sunt sortati dupa grupe deja cand sunt adaugati in curs
    //Aici doar se afiseaza pe grupe
    public void GroupStudents(Course course)
    {
        int groupNumber = 0;

        for(Student s : course.students)
        {

            if(s.groupNumber != groupNumber)
                System.out.println("Group: " + s.groupNumber);
            System.out.println(s);
            groupNumber = s.groupNumber;

        }

    }


    //Ex4

    public int CalculateAverageGrade(Course course)
    {
        course.setAverageGrade(0);
        for(Student s : course.students)
        {
            course.AverageGrade += s.courseGrades[course.CourseNumber];
        }

        return course.AverageGrade /= course.students.size();

    }

    public int CalculateAverageProfessorGrade(Professor prof)
    {
        int contor=0;

        int ProfessorAverageGrade = 0;

        for(Course c : courses)
        {

            if(c.teacher == prof)
            {
                ProfessorAverageGrade += CalculateAverageGrade(c);
                contor++;
            }


        }

        return ProfessorAverageGrade/contor;
    }

    @Override
    public void AddCourse(Course course) {

        courses.add(course);
        SortCourses();


    }

    public Course SearchCourse(String courseName)
    {

        for(Course c : courses)
            if(c.name.equals(courseName)) return c;

        return null;
    }

    //Functia De Sortare
    public void SortCourses()
    {

        Course[] sortedArray = new Course[courses.size()];
        Iterator<Course> iterator = courses.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            sortedArray[index] = iterator.next();
            index++;
        }



        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i].students.size() > sortedArray[j].students.size()) {

                    Course temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }


        courses.clear();
        Collections.addAll(courses, sortedArray);

    }


}