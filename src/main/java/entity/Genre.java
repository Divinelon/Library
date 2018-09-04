package entity;

/**
 * Created by admin on 03.09.2018.
 */
public class Genre {
    private int id;
    private String kindOfGenre;

    public Genre() {
    }

    public Genre(int id, String kindOfGenre) {
        this.id = id;
        this.kindOfGenre = kindOfGenre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKindOfGenre() {
        return kindOfGenre;
    }

    public void setKindOfGenre(String kindOfGenre) {
        this.kindOfGenre = kindOfGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Genre genre = (Genre) o;

        if (id != genre.id) return false;
        return kindOfGenre != null ? kindOfGenre.equals(genre.kindOfGenre) : genre.kindOfGenre == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (kindOfGenre != null ? kindOfGenre.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", kindOfGenre='" + kindOfGenre + '\'' +
                '}';
    }
}
