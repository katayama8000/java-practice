package Capsule;

public interface SmapleInterface2 extends SampleInterface {
    public abstract void say();

    @Override
    default void method() {
        System.out.println("Sample method2");
    }
}
