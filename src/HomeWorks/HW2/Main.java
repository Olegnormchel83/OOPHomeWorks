package HomeWorks.HW2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String WALL_OBSTACLE_NAME = "Wall";
        final String TREADMILL_OBSTACLE_NAME = "Treadmill";
        List<Character> characters = new ArrayList<>(Arrays.asList(
                new Human("Виктор Степаныч"),
                new Cat("Мурзик"),
                new Robot("Бэндер")
        ));
        List<Obstacle> obstacles = new ArrayList<>(Arrays.asList(
                new Wall("Wall", 1),
                new Treadmill("Treadmill", 10),
                new Wall("Wall", 2),
                new Treadmill("Treadmill", 100),
                new Wall("Wall", 50),
                new Treadmill("Treadmill", 100_000)
        ));

        for (Obstacle obstacle : obstacles) {
            for (Character character : characters) {
                if (obstacle.getObstacleName().equals(WALL_OBSTACLE_NAME)) {
                    character.jump(obstacle.getObstacleSize());
                }
                if (obstacle.getObstacleName().equals(TREADMILL_OBSTACLE_NAME)) {
                    character.run(obstacle.getObstacleSize());
                }
            }
            characters.removeIf(character -> !character.isSucces());
            System.out.println("------------------------------");
        }
    }
}

