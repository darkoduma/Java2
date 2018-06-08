
package course;

public class Course {
    private String name;
    private int numberOfClasses;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getnumberOfClasses() {
        return this.numberOfClasses;
    }

    public Course() {
        this.name = "no name";
        this.numberOfClasses = 0;
    }

    public Course(String name, int numberOfClasses) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;
    }
    
    
    
}
