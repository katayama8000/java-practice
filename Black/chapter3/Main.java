package Black.chapter3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Sample a = new Sample(1, "a");
        Sample c = a;
        Sample b = new Sample(1, "b");
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a == c);
    }

}
