
package aggregration;


import java.util.ArrayList;


public class SchoolManagementSystemApp {
    public static void main(String[] args){
        Student s1 = new Student(101,"Henry", "John",'m');
        Student s2 = new Student(102,"Joy", "Jack",'f');
        Student s3 = new Student(103,"Franklin", "Williams",'m');
        Student s4 = new Student(104,"Toby", "Emmanuel",'m');
        Student s5 = new Student(105,"Lucy", "Andy",'f');
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        School  school = new School("Green Land International",students);
        school.displayStudentDetails();
 }
            
}

