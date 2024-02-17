package Seminars.Sem6.Library;


import lombok.Getter;

public class Book {
    protected String name;
    @Getter
    protected String author;
    protected BookType bookType;
    protected BookGenre bookGenre;

    public Book(String name, String author, BookType bookType, BookGenre bookGenre) {
        this.name = name;
        this.author = author;
        this.bookType = bookType;
        this.bookGenre = bookGenre;
    }

    public Book(){
        name = "Book";
        author = "Tolstoy";
        bookType = BookType.PAPER;
        bookGenre = new BookGenre();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookType=" + bookType +
                ", bookGenre=" + bookGenre +
                '}';
    }
}
