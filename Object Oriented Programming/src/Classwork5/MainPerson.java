package Classwork5;

public class MainPerson {

    public static void main(String[] args) {

        System.out.println("For Student: \n");
        Student student = new Student("Princess", 15);
        student.displayDetails();
        student.performDuty();

        System.out.println("==========================\n");
        System.out.println("For Teacher: \n");
        Teacher teacher = new Teacher("Lily", 20);
        teacher.displayDetails();
        teacher.performDuty();

    }

}
