public class AnimalDog extends Animal {

    // public AnimalDog(String name, int age) {
    // super(name, age);
    // }

    public void say() {
        System.out.println("継承したクラス" + this.name);
        super.hello("ootani");
    }

    public void sayBow(String name) {
        System.out.println("Bow" + name + "!");
    }
}
