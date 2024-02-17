package Seminars.Sem6.Library;

public class TxtFormat implements IFormatter {
    @Override
    public String getFormatter(Book book) {
        return ".txt";
    }
}
