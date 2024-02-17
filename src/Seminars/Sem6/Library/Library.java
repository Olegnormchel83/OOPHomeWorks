package Seminars.Sem6.Library;

import java.util.ArrayList;
import java.util.List;

public class Library implements ISearchable, ILibManager {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    @Override
    public List<Book> getBookByAuthor(String payload) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equals(payload)) {
                result.add(book);
            }
        }

        return result;
    }

    @Override
    public void bookAdd(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return String.format("Books: %s", books);
    }

    @Override
    public List<Book> getBookList() {
        return books;
    }
}
