## tips

- package は分の一番上に書く必要がある。
- 初期値がなかったらデフォルト値 0 になる。
- ==と equals の違い。==は参照先が同じかどうかを比較する。equals は中身が同じかどうかを比較する。

```java
String str1 = "Java"; //新規でオブジェクトが作成される
String str2 = "Java"; //str1と同じオブジェクトを参照する
String str3 = new String("Java"); //新規でオブジェクトが作成される

System.out.println(str1 == str2); // true
System.out.println(str1 == str3); // false
System.out.println(str1.equals(str3)); // true
```

#### オーバーロード

- 引数、型、順番が違うメソッドを同じ名前で定義すること。
- 戻り値の型は関係ない。
- アクセス修飾子は関係ない。
