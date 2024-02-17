package Seminars.Sem6.Library;

public class HTMLFormat implements IFormatter {
    @Override
    public String getFormatter(Book book) {
        return ".html";
    }
}
