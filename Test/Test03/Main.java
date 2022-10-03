package Test.Test03;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Object s1 = new Sample(10);
        Object s2 = new Sample(10);
        System.out.println(s1.equals(s2));
    }

}
