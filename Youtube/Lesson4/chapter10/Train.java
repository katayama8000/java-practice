package Youtube.Lesson4.chapter10;

public class Train extends Vehicle {

    public Train(int crewnum) {
        this.crewnum = crewnum;
    }

    public void showCrewNum() {
        System.out.println("Crew number: " + crewnum);
    }
}
