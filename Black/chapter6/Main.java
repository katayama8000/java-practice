package Black.chapter6;

public class Main {
    public static void main(String[] args) {
        OverLoad overLoad = new OverLoad();
        overLoad.show(1);
        overLoad.show("a");
        // オーバーロードの条件は、名前が同じで、引数の型が異なること

        OverRide overRide = new OverRide();
        overRide.show(1);
        overRide.show("a");
        // オーバーライドの条件は、サブクラスで、スーパークラスのメソッドを上書きすること

        Sample sample = Sample.getInstance();
        // シングルトンパターン
        // インスタンスを一つしか作らないようにするパターン
        // インスタンスを作るときに、コンストラクターをprivateにする
        // インスタンスを作るときに、getInstanceメソッドを作る
        // getInstanceメソッドで、インスタンスがnullのときだけインスタンスを作る

        Sample2 sample2 = new Sample2();
        sample2.Sample2();

        Sample3 sample3 = new Sample3();

        Sample4 sample4 = new Sample4();

    }
}
