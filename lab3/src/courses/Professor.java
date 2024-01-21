package courses;

public class Professor extends Person {

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }



    public Professor() {

        this.name = " ";
        this.surname = " ";

    }

    public Professor(String name, String surname) {

        this.name = name;
        this.surname = surname;

    }
}