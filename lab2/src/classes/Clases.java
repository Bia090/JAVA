package classes;

import course.Course;

public class Clases {
    public static void main(String[] args)
    {

        Student[] students = new Student[]{new Student("Andrei" , "Popescu" , 2231), new Student("Ion" , "Mateescu", 4221)};
        Professor prof;
        prof = new Professor("Mihai" , "Dragomir");
        Course course;
        course= new Course("Material Resistance", """
                 Calculations of reactions ,
                effort diagrams , calculations of geometry characteristics of\s
                flat surfaces and calculations of resistance elements to simple stresses\s
                """, prof , students, 1);
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course);

        //courseManager.displayCoursesToConsole();

        //Ex1
        System.out.println(prof.getFullName());
        System.out.println(students[0].getFullName());
        Student stud1 = new Student("Rares" , "Bogdan" , 2256);
        stud1.AddGrade(5);
        students[0].AddGrade(8);
        students[1].AddGrade(9);
        //Ex2
        courseManager.DynamicCourseEnroll(course , stud1);
        System.out.println(course);

        //Ex3
        System.out.println(courseManager.listStudentsInCourse("Material Resistance"));

        //Ex4
        System.out.println(courseManager.CalculateAverageGrade(course));

        //Ex5
        Course course2 = new Course("Java", " Learning a new and better programming language" , prof , students , 2);
        courseManager.addCourse(course2);
        students[0].AddGrade(4);
        students[1].AddGrade(2);
        System.out.println(courseManager.CalculateAverageProfessorGrade(prof));



    }

}
