package HomeWorks.HW2;

public class Human extends Animated {
    private String humanName;
    private boolean succes = true;
    private final int HUMAN_MAX_RUN_DIST = 100;
    private final int HUMAN_MAX_JUMP_HEIGHT = 2;

    public Human(String humanName) {
        this.humanName = humanName;
    }
    public Human(){}

    @Override
    void run(int runDistance) {
        if (runDistance <= HUMAN_MAX_RUN_DIST) {
            System.out.println
                    ("Человек " + humanName + " смог пробежать "
                            + runDistance + " метров!");
            succes = true;
        } else {
            System.out.println
                    ("Человек " + humanName + " НЕ смог пробежать "
                            + runDistance + " метров!");
            succes = false;
        }
    }

    @Override
    void jump(int obstacleHeight) {
        if (obstacleHeight <= HUMAN_MAX_JUMP_HEIGHT) {
            System.out.println
                    ("Человек " + humanName + " смог перепрыгнуть препятствие высотой "
                            + obstacleHeight + " метров!");
            succes = true;
        } else {
            System.out.println
                    ("Человек " + humanName + " НЕ смог перепрыгнуть препятствие "
                            + obstacleHeight + " метров!");
            succes = false;
        }
    }

    public boolean isSucces() {
        return succes;
    }
}
