package Capsule;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Sample sample = new Sample("tama", 3);
        // System.out.println(sample.name);
        System.out.println(sample.getName());
        sample.setName("yamada");
        System.out.println(sample.getName());
        System.out.println(sample.getEveryThing());
        int num = 0;
        num = Integer.parseInt(sample.getEveryThing().get("age"));
        System.out.println(num + 1);
    }
}
