package HomeWorks.HW5.Identity;

public class Prepodavatel extends Character {
    private int prepId;

    public Prepodavatel(String fullName, int prepId) {
        super(fullName);
        this.prepId = prepId;
    }

    public Prepodavatel() {

    }

    @Override
    public String toString() {
        return "prepId= " + prepId + ", " + super.toString();
    }

    public void setPrepId(int prepId) {
        this.prepId = prepId;
    }
}
