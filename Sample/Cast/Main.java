package Sample.Cast;

public class Main {
    public static void main(String... args) {
        Parent p = new Child();
        Child c = (Child) p;

        // これはダメ
        // Parent p = new Parent();
        // Child c = (Child) p;
        // ClassCastException
        // Childクラスのインスタンスではないのでダウンキャストできない
        // ダウンキャストできるのは、親クラスのインスタンスが子クラスのインスタンスであるときだけ

        int a = 100;
        double b = 1.8;
        String c1 = "100";
        double d = 0.4;
        float e = 0.5f;

        System.out.println(Integer.parseInt((int) (a + b) + c1) + (int) d);
        // a + bはint型になるので、int型にキャスト = 101
        // 101 + c1はString型になるので、String型にキャスト = "101100"
        // 101100をint型に変換 = 101100
        // 101100 + d = 101100.4

        System.out.println((int) (b));
        // bはdouble型なので、int型にキャスト = 1
        // double型をint型にキャストすると小数点以下は切り捨てられる

        System.out.println((int) (e));
        // eはfloat型なので、int型にキャスト = 0
        // float型をint型にキャストすると小数点以下は切り捨てられる

    }
}
