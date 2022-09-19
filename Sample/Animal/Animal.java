package Sample.Animal;

abstract class Animal {
    protected String name = "sss";
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("My name is " + name + ", " + age + " years old.");
    }

    protected void hello(String name) {
        System.out.println("Hello " + name + "!");
    }

    abstract public void sayBow(String name);
}
