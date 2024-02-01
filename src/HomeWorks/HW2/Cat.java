package HomeWorks.HW2;

public class Cat extends Animated{
    private String catName;
    private boolean succes = true;
    private final int CAT_MAX_RUN_DIST = 50;
    private final int CAT_MAX_JUMP_HEIGHT = 1;

    public Cat(String catName) {
        this.catName = catName;
    }
    public Cat(){}

    @Override
    void run(int runDistance) {
        if (runDistance <= CAT_MAX_RUN_DIST) {
            System.out.println
                    ("Кот " + catName + " смог пробежать "
                            + runDistance + " метров!");
            succes = true;
        } else {
            System.out.println
                    ("Кот " + catName + " НЕ смог пробежать "
                            + runDistance + " метров!");
            succes = false;
        }
    }

    @Override
    void jump(int obstacleHeight) {
        if (obstacleHeight <= CAT_MAX_JUMP_HEIGHT) {
            System.out.println
                    ("Кот " + catName + " смог перепрыгнуть препятствие высотой "
                            + obstacleHeight + " метров!");
            succes = true;
        } else {
            System.out.println
                    ("Кот " + catName + " НЕ смог перепрыгнуть препятствие "
                            + obstacleHeight + " метров!");
            succes = false;
        }
    }

    public boolean isSucces() {
        return succes;
    }
}
