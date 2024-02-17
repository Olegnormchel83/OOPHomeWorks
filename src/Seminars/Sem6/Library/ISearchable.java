package Seminars.Sem6.Library;

import java.util.List;

public interface ISearchable {
    List<Book> getBookByAuthor(String payload);
}
