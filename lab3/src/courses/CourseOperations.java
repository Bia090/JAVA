package courses;

public interface CourseOperations {

    public void UpdateProfessor(Professor p);
    public void AddStudent(int student);

    void AddStudent(Student student);

    public void RemoveStudent(courses.Student student);
    public void UpdateStudent(courses.Student student);
    public void UpdateCourse(String name, String description);


}