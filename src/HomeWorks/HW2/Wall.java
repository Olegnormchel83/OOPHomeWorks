package HomeWorks.HW2;

public class Wall extends Obstacle{
    private int wallHeight;
    private String obstacleName;

    public Wall(String obstacleName, int wallHeight) {
        this.obstacleName = obstacleName;
        this.wallHeight = wallHeight;
    }

    public Wall() {
    }

    public int getObstacleSize() {
        return wallHeight;
    }
    public String getObstacleName() { return obstacleName; }

    public void setWallHeight(int wallHeight) {
        this.wallHeight = wallHeight;
    }
}
