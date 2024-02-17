package Seminars.Sem6.Library;

public class BookGenre implements IGenre {
    private String name;
    private String description;

    public BookGenre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public BookGenre() {
        name = "Fantasy";
    }

    @Override
    public String getGenre() {
        return name;
    }

    @Override
    public String toString() {
        return "BookGenre{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
