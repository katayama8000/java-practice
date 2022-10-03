package Test.Test04;

public class Main {
    public static void main(String[] args) {
        // error
        A a = new A();
        B b = (B) a;
        b.hello();
    }
}
