package Sample.Cast;

public class Main {
    public static void main(String... args) {
        Parent p = new Child();
        Child c = (Child) p;

    }
}
