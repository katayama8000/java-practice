package Test.Test04;

public class Main {
    public static void main(String[] args) {
        // error
        A a = new B();
        B b = (B) a;
        b.hello();

        // これはできない
        // A a = new A();
        // B b = (B) a;
        // b.hello();
        // ClassCastException
        // Bクラスのインスタンスではないのでダウンキャストできない
        // ダウンキャストできるのは、AクラスのインスタンスがBクラスのインスタンスであるときだけ

        Object s = new String("10");
        String s1 = (String) s;
        System.out.println(s1.length());

        // 配列を作る
        Object array = new int[5];
        // 配列をキャストする
        int[] array1 = (int[]) array;
        System.out.println(array1.length);

    }
}
