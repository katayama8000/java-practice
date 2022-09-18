package Capsule;

public interface SampleInterface {
    default void method() {
        System.out.println("Sample method");
    }
}