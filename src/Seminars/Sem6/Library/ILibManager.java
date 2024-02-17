package Seminars.Sem6.Library;

import java.util.List;

public interface ILibManager {
    void bookAdd(Book book);
    List<Book> getBookList();
}
