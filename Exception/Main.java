package Exception;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            int[] array = { 1, 2, 3 };
            System.out.println(Arrays.toString(array));
            Integer number = array[1];
            System.out.println(number);
            if (number == 2) {
                throw new NumberFormatException("2は不正な値です");
            }
            // System.out.println(array);
            // System.out.println(array[1]);
            // System.out.println(array[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("配列の添え字が不正です");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("例外が発生しました");
        } finally {
            System.out.println("プログラム終了");
        }
    }

}
