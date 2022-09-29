package Black.chapter5;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[3];
        Class c = array.getClass();
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        System.out.println(c.getCanonicalName());
        System.out.println(c);

    }
}
