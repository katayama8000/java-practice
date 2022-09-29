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

    }
}
