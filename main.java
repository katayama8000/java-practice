public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String s1 = "Hello";
        String s2 = "Hello";
        if(s1.equals(s2)) {
            System.out.println("s1 and s2 are equal");
        }
        else {
            System.out.println("s1 and s2 are not equal");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());
    }
}