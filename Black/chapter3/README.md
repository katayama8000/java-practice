## コンスタントプール

- 使いまわし
- メモリ節約

## case 値として指定できるもの

- int 以下の整数型とそのラッパークラス
- 文字と文字列
- 列挙型

## equals

- x.equals(null)は false

## 拡張 for

- 配列やコレクションの要素を順に取り出す
- for (型 変数名 : 配列やコレクション) { ... }

```java
int[] array = {1, 2, 3};
for (int i : array) {
    System.out.println(i);
}
```
