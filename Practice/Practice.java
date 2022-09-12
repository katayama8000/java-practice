package Practice;

public class Practice {
    public static void main(String[] args) {
        Test test = new Test();
        test.addAnimal("tama", 3);
        test.removeAnimal("tama");
        test.addAges();
        Getset getset = new Getset();
        getset.setName("yamada");
        System.out.println(getset.getName());
    }

}
