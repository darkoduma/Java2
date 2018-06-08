package student;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;

    public Student() {
        this.firstName = "not defined";
        this.lastName = "not defined";
        this.yearOfBirth = 0;

    }

    public Student(String firstName, String lastName, int yearOfBirth, String cours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void info() {
        System.out.println("First name is: " + getFirstName());
        System.out.println("Last name is: " + getLastName());
        System.out.println("Year of birth is: " + getYearOfBirth());
    }

    public String getCours() {
        return this.cours;
    }

}
