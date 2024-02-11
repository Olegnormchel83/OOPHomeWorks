package HomeWorks.HW5.Identity;

public abstract class Character {
    private String fullName;

    public Character(String fullName) {
        this.fullName = fullName;
    }

    public Character() {
    }

    @Override
    public String toString() {
        return "fullName - " + fullName;
    }
}
