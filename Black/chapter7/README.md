## サブクラスがスーパークラスから、引き継がないもの

- コンストラクター
- private なフィールドやメソッド

## アクセス修飾子

- public
- なし
- protected
- private

## interface

- インターフェースは、メソッドのシグネチャのみを定義する
- インターフェースは、複数のインターフェースを実装できる
- インターフェースは、クラスが実装する
- インターフェースのメソッドは、public である
- インターフェースのメソッドは、abstract である
- インターフェースは、コンストラクターを持つことができない
- インターフェースはフィールドを持つことができない。しかし、定数を持つことができる
  - public static final

```java
interface Sample {
    public static final int NUM = 10;
    // public static final は省略可能
    public abstract void methodA();
    public abstract void methodB();
}
```
