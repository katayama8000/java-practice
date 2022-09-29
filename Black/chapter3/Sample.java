package Black.chapter3;

public class Sample {
    private int num;
    private String name;

    public Sample(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Sample) {
            System.out.println(obj);
            Sample s = (Sample) obj;
            System.out.println(s);
            if (this.num == s.num) {
                return true;
            }
        }

        return false;
    }
}
