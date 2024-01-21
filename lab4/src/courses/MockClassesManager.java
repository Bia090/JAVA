package courses;

import java.util.LinkedHashSet;

public class MockClassesManager implements ISourceManager {


    @Override
    public void AddCourse(Course course) {

        throw new UnsupportedOperationException("Not supported yet.");

    }


    public static void main(String[] args) {

        LinkedHashSet<Student> students = new LinkedHashSet<>();
        LinkedHashSet<Student> students2 = new LinkedHashSet<>();


        Student stud1 = new Student("Robert", "Ion", 4213);
        Student stud4 = new Student("Boba" , "Feta" , 7891);
        Student stud5 = new Student("Robert", "Ion",  7891);
        Student stud2 = new Student("Rares" , "Bogdan", 1893);
        Student stud6 = new Student("Popa" , "Lorenzo" , 5555);
        students2.add(stud5);
        students2.add(stud4);
        students.add(stud2);
        students.add(stud1);
        students.add(stud6);


        Professor prof = new Professor("Anton" , "Panaitescu");


        Course course = new Course("Material Resistance", """
                 Calculations of reactions ,
                effort diagrams , calculations of geometry characteristics of\s
                flat surfaces and calculations of resistance elements to simple stresses\s
                """, prof , students, 1);
        Course course2 = new Course("Java", " Programming" , prof , students2, 1);

        CourseManager courseManager = new CourseManager();
        courseManager.AddCourse(course);
        courseManager.AddCourse(course2);





        stud1.AddGrade(10);
        stud2.AddGrade(5);

        //ex1
        courseManager.GroupStudents(course);
        //ex2
        System.out.println(stud1.compareTo(stud5));
        //ex3
        courseManager.SortCourses();
        courseManager.displayCoursesToConsole();
        //ex4
        System.out.println(courseManager.SearchCourse("Java"));



    }

}