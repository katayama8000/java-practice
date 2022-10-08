package Test.Test06;

public class Main {
    public static void main(String[] args) {
        Sample s = new Sample(10);
        System.out.println(s);
        modify(s);
        System.out.println(s.num);

        Sample3 s3 = new Sample3();
        s3.hello();
    }

    private static void modify(Sample s) {
        s.num *= 2;
    }
}
