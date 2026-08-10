package Classwork5;

public class Teacher extends Person {

    public Teacher(String Name, int age) {
        super(Name, age);
    }

    @Override
    void performDuty() {
        System.out.println("Your duty is to teach");
    }

}
