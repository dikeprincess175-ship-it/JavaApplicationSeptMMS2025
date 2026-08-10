package Classwork5;

public abstract class Person {

    String name;
    int age;

    public Person(String Name, int age) {
        this.name = Name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

    }

    abstract void performDuty();

}
