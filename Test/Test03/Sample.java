package Test.Test03;

public class Sample {
    private int num = 0;

    public Sample(int num) {
        this.num = num;
    }

    // オーバーロード
    public boolean equals(Sample obj) {
        System.out.println("wwwwwwwwwwwwwwww");
        if (obj == null) {
            return false;
        }

        System.out.println(this.num + "2" + obj.num);
        return this.num == obj.num;
    }
}
