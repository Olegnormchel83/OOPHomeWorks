package HomeWorks.HW5.Identity;

public class Uchenyk extends Character {
    private int uchenykId;

    public Uchenyk(String fullName, int uchenykId) {
        super(fullName);
        this.uchenykId = uchenykId;
    }

    public Uchenyk(String fullName) {
        super(fullName);
    }
    public Uchenyk() {

    }

    @Override
    public String toString() {
        return "uchenykId= " + uchenykId + ", " + super.toString();
    }

    public int getUchenykId() {
        return uchenykId;
    }

    public void setUchenykId(int uchenykId) {
        this.uchenykId = uchenykId;
    }
}
