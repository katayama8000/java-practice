package Youtube.Lesson5.chapter2;

public class Main {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("計算開始");
            System.out.println(a / b);
            System.out.println("計算終了");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("詳細" + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("詳細" + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("終了処理");
        }

    }

}
