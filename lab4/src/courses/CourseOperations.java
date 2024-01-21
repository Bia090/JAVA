package courses;

public interface CourseOperations {

    void UpdateProfessor(Professor p);
    void AddStudent(Student student);
    void RemoveStudent(Student student);
    void UpdateStudent(Student student);

    default void UpdateCourse() {
        UpdateCourse(null, null);
    }

    void UpdateCourse(String name, String description);


}