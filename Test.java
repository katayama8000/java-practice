import java.util.*;

public class Test {
    ArrayList<String> animals = new ArrayList<String>();
    HashMap<String, Integer> ages = new HashMap<String, Integer>();

    public Test() {
        animals.add("tama");
        animals.add("pochi");
        animals.add("kuro");
    }

    public void addAges() {
        ages.put("tama", 2);
        ages.put("aa", 2);
        ages.put("dd", 2);
        ages.put("gg", 2);
        System.out.println(ages);
    }

    public void addAnimal(String name, int age) {
        animals.add("tama");
        System.out.println(animals);
    }

    public void removeAnimal(String name) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).equals(name)) {
                animals.remove(i);
            }
        }
        System.out.println(animals);
    }

    public void clearAniomals() {
        animals.clear();
        System.out.println(animals);
    }
}
