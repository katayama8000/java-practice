package Youtube.Lesson4.chapter6;

public class Student extends Person {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student " + name + " " + age);
    }
}
