package Test.Test05;

public class Main {
    public static void main(String[] args) {

        Sample1 s2 = new Sample2();
        s2.hello();
        s2.greet1();

        // error
        // Sample1の入れ物にgreet2()がない
        // s2.greet2();

        Sample1 s1 = new Sample1();
        s1.hello();
        s1.greet1();

        Sample2 s2_New = new Sample2();
        s2_New.hello();
        s2_New.greet2();

    }
}
