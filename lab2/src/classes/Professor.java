package classes;
public class Professor {
    String firstName;
    String lastName;

    public String toString() {
        return "Professor{ " + "firstName=" + firstName + ".lastName=" + lastName + '}';
    }

    public Professor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

//Ex1
    public String getFullName()
    {
        return firstName+" "+lastName;
    }
}