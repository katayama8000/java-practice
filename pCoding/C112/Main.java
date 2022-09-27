package pCoding.C112;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // 最大值
        int max = 0;
        // 最小值
        int min = 0;
        int result = 23;

        // 求最大值,最小值
        for (int i = 0; i < 4; i++) {
            if (result > max) {
                max = result;
            }
            if (result < min) {
                min = result;
            }
        }
    }

}
