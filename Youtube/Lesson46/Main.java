package Youtube.Lesson46;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student("Ivan", 22);
        Person psn = stu;
        Student stu2 = (Student) psn;
        psn.display();
        stu2.display();
    }
}
