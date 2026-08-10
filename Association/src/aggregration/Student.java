package aggregration;


public class Student {
   private int studentID;
   private  String firstName;
   private String lastName;
   private char gender;

    public Student(int studentID, String firstName, String lastName, char gender) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
   void displayStudentDetails(){
          System.out.println("====================================");
   System.out.printf("\n");

   System.out.printf("StudentID %s%n", studentID);
   System.out.printf("Student's First Name: %s%n", firstName);
   System.out.printf("Student's Last Name: %s%n" ,lastName);
   System.out.printf("Student's Gender: %s%n",gender);
   
   }
}