package Youtube.Lesson4.chapter7;

public class StuSample6 {
    public static void main(String[] args) {
        TandF taf = new TandF("TandF");
        Football fb = new Football("FootBall");

        Student6 stu1 = new Student6("My Club is TandF", taf);
        stu1.display();
        stu1.practice();

        Student6 stu2 = new Student6("Ny Club is FootBall", fb);
        stu2.display();
        stu2.practice();

    }
}
