package Classwork5;

public class Student extends Person {
    
    public Student(String Name, int age) {
        super(Name, age);
    }
    
    @Override
    void performDuty() {
        System.out.println("Your duty is to learn");
    }
    
}
