package Seminars.Sem6.Library;

public class JsonFormat implements IFormatter {
    @Override
    public String getFormatter(Book book) {
        return ".json";
    }
}
