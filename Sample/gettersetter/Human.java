package Sample.gettersetter;

public class Human {
    private String name;
    private int age;
    private int cresit_card_number;

    public Human(String name, int age, int cresit_card_number) {
        this.name = name;
        this.age = age;
        this.cresit_card_number = cresit_card_number;
    }

    public Boolean isAdult() {
        return this.age >= 20 ? true : false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCresit_card_number() {
        return this.cresit_card_number;
    }

    public void setCresit_card_number(int cresit_card_number) {
        this.cresit_card_number = cresit_card_number;
    }
}
