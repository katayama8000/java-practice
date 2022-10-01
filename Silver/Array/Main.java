package Silver.Array;

public class Main {
    public static void main(String... args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        int[] array2 = { 1, 2, 3, 4, 5 };
        int[] array3 = new int[] { 1, 2, 3, 4, 5 };

        System.out.println(array);
        System.out.println(array2);
        System.out.println(array3);
        System.out.println(array[0] == array2[0]);
        System.out.println(array.equals(array3));

        Change change = new Change();
        change.printArray("Bob", 1, 2, 3, 4, 5);

    }
}
