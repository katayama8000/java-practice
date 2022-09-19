package Youtube.Lesson4.chapter10;

public class Bus extends Vehicle implements Stopable {

    public Bus(int crewnum) {
        this.crewnum = crewnum;
    }

    public void showCrewNum() {
        System.out.println("Crew number: " + crewnum);
    }

    public void stop() {
        System.out.println("Bus stop");
    }
}
