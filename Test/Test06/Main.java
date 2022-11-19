package Test.Test06;

public class Main {
    public static void main(String[] args) {
        Sample s = new Sample(10);
        System.out.println(s);
        modify(s);
        System.out.println(s.num);

        Sample3 s3 = new Sample3();
        s3.hello();

        Sample4 s4 = new Sample4();
        System.out.println(s4.getImportantNumber());
        s4.setImportantNumber(100);
        System.out.println(s4.getImportantNumber());
        
    }

    private static void modify(Sample s) {
        s.num *= 2;
    }
}
