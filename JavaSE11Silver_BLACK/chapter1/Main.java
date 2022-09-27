package JavaSE11Silver_BLACK.chapter1;

public class Main {
    public static void main(String[] strings) {
        // エントリーポイントの条件
        // 1. public
        // 2. static
        // 3. void
        // 4. main
        // 5. String[] args or String... args or String... strings
        // エントリーポイントの引数は配列[]だけではなく、可変長引数...も可能
        System.out.println(strings.length);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        // コマンドライン引数が[a \" aa "]のとき
        // 一つ目のダブルクォーテーションの前に￥があるので、\"は文字列として認識される
        // 3 a " aa

        // エスケープシーケンス
        // ダブルクォーテーションをエスケープ
        System.out.println("\"");
        // シングルクォーテーションをエスケープ
        System.out.println("\'");

    }
}
