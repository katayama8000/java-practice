import java.util.Date;

public class Main {
    public static void hello(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        hello("katayama");
        String s1 = "Hello";
        String s2 = "Hello";
        if (s1.equals(s2)) {
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());

        Date now = new Date();
        System.out.println(now);
    }

}
