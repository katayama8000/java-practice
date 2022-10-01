package Silver.Array;

public class Change {
    // 可変長引数
    public static void printArray(String name, int... array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(name);
    }
}
