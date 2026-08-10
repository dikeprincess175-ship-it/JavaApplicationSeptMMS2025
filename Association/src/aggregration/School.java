package aggregration;

import java.util.ArrayList;
import java.util.List;


public class School {
    private String schoolName;
    private List<Student> student;
 
      public School(String schoolName, ArrayList student) {
        this.schoolName = schoolName;
        this.student = student;
    }
    public void displayStudentDetails(){
       System.out.printf("School Name:%s%n ",schoolName);
    
     for(Student students : student){
        students.displayStudentDetails();

}}
}