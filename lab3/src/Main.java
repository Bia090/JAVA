import courses.Course;
import courses.CourseManager;
import courses.Professor;
import courses.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[]{new Student("Andrei" , "Negoita" , 2231), new Student("Ion" , "Mateescu", 4221)};
        Professor professor = new Professor("Jamal" , "Ferdinand");
        Professor professor2 = new Professor("Gica" , "Petrescu");
        Course course = new Course("Material Resistance", """
                 Calculations of reactions ,
                effort diagrams , calculations of geometry characteristics of\s
                flat surfaces and calculations of resistance elements to simple stresses\s
                """, professor , students, 1);
        Course course2 = new Course("Material Resistance", """
                 Calculations of reactions ,
                effort diagrams , calculations of geometry characteristics of\s
                flat surfaces and calculations of resistance elements to simple stresses\s
                """, professor2 , students, 1);
        Course course3 = new Course("Java", " Learning a better programming language" , professor , students, 2);
        CourseManager courseManager = new CourseManager();

        //Verifica update course
        courseManager.AddCourse(course);
        courseManager.UpdateCourse(course2);
        courseManager.displayCoursesToConsole();

        //Verifica remove student
        course.RemoveStudent(students[1]);
        courseManager.UpdateCourse(course);
        courseManager.displayCoursesToConsole();

        //Verifica delete course
        courseManager.AddCourse(course3);
        courseManager.DeleteCourse(course);
        courseManager.displayCoursesToConsole();


    }
}