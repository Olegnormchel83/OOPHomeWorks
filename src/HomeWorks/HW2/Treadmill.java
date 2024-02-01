package HomeWorks.HW2;

public class Treadmill extends Obstacle{
    private int treadmillLength;
    private String obstacleName;

    public Treadmill(String obstacleName, int treadmillLength) {
        this.obstacleName = obstacleName;
        this.treadmillLength = treadmillLength;
    }

    public Treadmill() {}

    public int getObstacleSize() {
        return treadmillLength;
    }
    public String getObstacleName() {
        return obstacleName;
    }

    public void setTreadmillLength(int treadmillLength) {
        this.treadmillLength = treadmillLength;
    }
}
