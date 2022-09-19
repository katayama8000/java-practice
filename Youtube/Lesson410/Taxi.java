package Youtube.Lesson410;

public class Taxi extends Vehicle {

    public Taxi(int crewnum) {
        this.crewnum = crewnum;
    }

    public void showCrewNum() {
        System.out.println("Crew number: " + crewnum);
    }
}
