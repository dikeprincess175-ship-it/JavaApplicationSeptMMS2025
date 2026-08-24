package aggregration;

import composition.Payment;
import java.time.LocalDate;
import java.util.ArrayList;

public class SchoolManagementSystemApp {

    public static void main(String[] args) {
        // Students objects created
        Student s1 = new Student(101, "Henry", "John", 'm');
        Student s2 = new Student(102, "Joy", "Jack", 'f');
        Student s3 = new Student(103, "Franklin", "Williams", 'm');
        Student s4 = new Student(104, "Toby", "Emmanuel", 'm');
        Student s5 = new Student(105, "Lucy", "Andy", 'f');
        Student s6 = new Student(106, "Lucky", "Anthony", 'm');
        Student s7 = new Student(107, "Lucy", "Victor", 'f');

        

        
        s1.makePayment(3000000,
                LocalDate.of(2018, 8, 10),
                "transfer",
                "Paid for data analytics"
        );
        
        s3.makePayment(5000000.00,
                LocalDate.of(2026, 8, 8),
                "POS",
                "Paid for Java"
        );
               s5.makePayment(3500000.00,
                LocalDate.of(2018, 8, 5),
                "transfer",
                "Paid for MMS"
        );
               
         
        s6.makePayment(5039392.00,
                LocalDate.of(2016, 4, 11),
                "POS",
                "Paid for CyberSecurity"
        );
        
        
        s7.makePayment(303000000.00,
                LocalDate.of(2023, 7, 10),
                "POS",
                "Paid for Full Stack Devolopment"
        );
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        

        School school = new School("Green Land International", students);
        school.displaySchoolDetails();
        
       

    }

}
