package Youtube.Lesson4.chapter10;

public class Taxi extends Vehicle {

    public Taxi(int crewnum) {
        this.crewnum = crewnum;
    }

    public void showCrewNum() {
        System.out.println("Crew number: " + crewnum);
    }
}
