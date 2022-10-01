package Black.chapter6;

public class Sample {

    private static Sample instance = null;

    // privateなコンストラクター
    private Sample() {
        System.out.println("private constructor");
    }

    // 呼び出し
    public static Sample getInstance() {
        if (instance == null) {
            instance = new Sample();
        }

        return instance;
    }

}
