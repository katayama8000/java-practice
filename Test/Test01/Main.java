package Test.Test01;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        // staticメソッドはインスタンス化しなくても呼び出せる
        // staticは全てのインスタンスで共有される
        Teacher.money = 400;
        teacher.subject1 = 2;
        Teacher teacher_Math = new Teacher();

        teacher_Math.subject = "数学";

        System.out.println(teacher.subject);
        System.out.println(teacher.subject1);
        System.out.println(Teacher.money);

        System.out.println(teacher_Math.subject);
        System.out.println(teacher_Math.subject1);
        System.out.println(Teacher.money);

        // System.out.println(Teacher.money);
        // System.out.println(teacher.subject);
        // System.out.println(teacher.subject1);
        // Student student = new Student();
        // System.out.println(student.subject);
        // System.out.println(student.subject1);
    }

}
