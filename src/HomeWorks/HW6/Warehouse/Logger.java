package HomeWorks.HW6.Warehouse;

public class Logger implements ILogger {
    @Override
    public void log(String text) {
        System.out.println("\tLOG: " + text);
    }
}
