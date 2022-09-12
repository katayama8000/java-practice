package Animal;

public interface AnimalInterface {

    // interfaceの特徴
    // 1.メソッドのみ定義できる
    // 2.継承できる
    // 3.複数のインターフェースを継承できる
    // 4.インターフェースは実装クラスで実装する必要がある

    public abstract void sayBow(String name);
}
