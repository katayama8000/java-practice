package Youtube.Lesson4.chapter7;

public abstract class Club {
    private String name;

    public Club(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("My Favorite is " + name);
    }

    public abstract void practice();
}
