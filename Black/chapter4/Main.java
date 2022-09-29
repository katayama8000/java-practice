package Black.chapter4;

public class Main {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10 && j < 6; i++, j++) {
            // System.out.println(i + " " + j);
        }

        // 拡張for文
        int[] array = { 1, 2, 3, 4, 5 };
        for (int i : array) {
            // System.out.println(i);
        }

        // ラベル
        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 2) {
                    break outer;
                }
                System.out.println(i + " " + j);
            }
        }

        // 前置インクリメント、後置インクリメント
        int num = 10;
        do {
            num++;
        } while (num++ < 10);
        System.out.println(num);

        int num2 = 10;
        while (++num2 <= 10) {
            num2++;
        }
        System.out.println(num2);

    }
}
