package Seminars.Sem6.Library;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Book eBook = new ElectronicBook();

        Library library = new Library();
        library.bookAdd(book);
        library.bookAdd(eBook);

        IFormatter formatter = new JsonFormat();
        System.out.println("formatter.getFormatter(book) = " + formatter.getFormatter(book));
        formatter = new TxtFormat();
        System.out.println("formatter.getFormatter(book) = " + formatter.getFormatter(book));
        formatter = new HTMLFormat();
        System.out.println("formatter.getFormatter(book) = " + formatter.getFormatter(book));
    }
}
