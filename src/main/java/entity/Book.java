package entity;

/**
 * Created by admin on 03.09.2018.
 */
public class Book {
    private int bookId;
    private String title;
    private int count;
    private int year;
    private int authorId;
    private int genreId;

    public Book() {
    }

    public Book(int bookId, String title, int count, int year, int authorId, int genreId) {
        this.bookId = bookId;
        this.title = title;
        this.count = count;
        this.year = year;
        this.authorId = authorId;
        this.genreId = genreId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (bookId != book.bookId) return false;
        if (count != book.count) return false;
        if (year != book.year) return false;
        if (authorId != book.authorId) return false;
        if (genreId != book.genreId) return false;
        return title != null ? title.equals(book.title) : book.title == null;
    }

    @Override
    public int hashCode() {
        int result = bookId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + count;
        result = 31 * result + year;
        result = 31 * result + authorId;
        result = 31 * result + genreId;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", count=" + count +
                ", year=" + year +
                ", authorId=" + authorId +
                ", genreId=" + genreId +
                '}';
    }
}
