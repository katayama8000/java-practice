import java.util.Date;

public class Main {
    public static void hello(String name) {
        System.out.println(name);
    }

    public static void calc(int[] x) {
        int i;
        int sum = 0;
        for (i = 0; i < x.length; i++) {
            sum += x[i];
        }

        System.out.println("平均点は" + sum / x.length + "です");
    }

    public static void main(String[] args) {
        int[] score = { 20, 30, 40, 50, 80 };
        calc(score);

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
        // System.out.println(sb.toString());

        Date now = new Date();
        System.out.println(now);
    }

}
