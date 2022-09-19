package Sample.Animal;

import Sample.Practice.Getset;
import Sample.Practice.Test;

public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal("tama", 3);
        // animal.say();
        Test test = new Test();
        test.addAnimal("tama", 3);
        test.removeAnimal("tama");
        test.addAges();
        Getset getset = new Getset();
        getset.setName("yamada");
        System.out.println(getset.getName());
        AnimalDog animalDog = new AnimalDog("tama", 3);
        animalDog.say();
        animalDog.sayBow("tanaka");
    }
}
