package HomeWorks.HW2;

public class Robot extends Inanimate{
    private String robotName;
    private boolean succes = true;
    private final int ROBOT_MAX_RUN_DIST = 100_000;
    private final int ROBOT_MAX_JUMP_HEIGHT = 100;

    public Robot(String robotName) {
        this.robotName = robotName;
    }

    public Robot() {}

    @Override
    void run(int runDistance) {
        if (runDistance <= ROBOT_MAX_RUN_DIST) {
            System.out.println
                    ("Робот " + robotName + " смог пробежать "
                            + runDistance + " метров!");
            succes = true;
        } else {
            System.out.println
                    ("Робот " + robotName + " НЕ смог пробежать "
                            + runDistance + " метров!");
            succes = false;
        }
    }

    @Override
    void jump(int obstacleHeight) {
        if (obstacleHeight <= ROBOT_MAX_JUMP_HEIGHT) {
            System.out.println
                    ("Робот " + robotName + " смог перепрыгнуть препятствие высотой "
                            + obstacleHeight + " метров!");
            succes = true;
        } else {
            System.out.println
                    ("Робот " + robotName + " НЕ смог перепрыгнуть препятствие "
                            + obstacleHeight + " метров!");
            succes = false;
        }
    }

    public boolean isSucces() {
        return succes;
    }
}
