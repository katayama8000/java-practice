package Sample.Animal;

public class AnimalCat implements AnimalInterface, AnimalInterface2 {

    public void sayBow(String name) {
        System.out.println("Bow" + name + "!");
    }

    public void say() {
        System.out.println("!");
    }
}
