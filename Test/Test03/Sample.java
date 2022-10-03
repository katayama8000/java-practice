package Test.Test03;

public class Sample {
    private int num = 0;

    public Sample(int num) {
        this.num = num;
    }

    public boolean equals(Sample obj) {
        if (obj == null) {
            return false;
        }

        System.out.println(this.num + "2" + obj.num);
        return this.num == obj.num;
    }
}
