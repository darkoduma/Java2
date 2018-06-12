
package Main;

import computer.Computer;
import course.Course;
import student.Student;

public class main {

    public static void main(String[] args) {
       Student studentDarko = new Student();
       studentDarko.info();
       
       Course courseQA = new Course("QA kurs", 15);
       courseQA.info();
       
       Computer computer1 = new Computer(3.4, 8, 250);
       computer1.info();
       
       
       Student student2 = new Student("Marko", "Markovic", 2000, courseQA);
       
       Student student3 = new Student("Jovan", "Jovanovic", 1999, courseQA, computer1);
       student3.info();
       
       
    }
    
}
