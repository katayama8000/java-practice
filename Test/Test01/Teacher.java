package Test.Test01;

public class Teacher {
    public String subject;
    public int subject1;

    static int money = 13;

    public Teacher() {
        this("未定義");
    }

    public Teacher(String subject) {
        this(3, "未定義");
    }

    public Teacher(int subject1, String subject) {
        this.subject = subject;
        this.subject1 = subject1;
    }

}
