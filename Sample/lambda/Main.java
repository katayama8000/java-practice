package Sample.lambda;

public class Main {

    public static int mainSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Sam sam = Main::mainSum;
        System.out.println("3+5" + sam.sum(3, 5));
    }

}
