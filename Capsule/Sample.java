package Capsule;

import java.util.*;

public class Sample implements SmapleInterface2 {

    // メソッドはpublicでなければならないフィールドはprivate
    // publicが一番緩い
    // privateが一番厳しい
    // privateは同じクラス内でしか使えない
    // publicはどこでも使える
    // package privateは同じパッケージ内でしか使えない

    private String name;
    private int age;

    public Sample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getEveryThing() {
        Map<String, String> info = new HashMap<>(); // Mapの宣言
        info.put("name", this.name);
        info.put("age", String.valueOf(this.age));
        return info;
    }
}
