package student;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;

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
    
    public Info(){
        this.firstName = "Darko";
        this.lastName = "Dumanjic";
        this.yearOfBirth = 1984;
    }

}
