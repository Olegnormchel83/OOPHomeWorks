package Seminars.Sem6.Library;

public class ElectronicBook extends Book {
    private String format;
    private int size;

    public ElectronicBook(String name, String author, BookType bookType, BookGenre bookGenre, String format, int size) {
        super(name, author, bookType, bookGenre);
        this.format = format;
        this.size = size;
    }

    public ElectronicBook() {
        size = 32;
        format = "pdf";
    }

    @Override
    public String toString() {
        return "ElectronicBook{" +
                "format='" + format + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookType=" + bookType +
                ", bookGenre=" + bookGenre +
                "} ";
    }
}
