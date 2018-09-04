package entity;

/**
 * Created by admin on 03.09.2018.
 */
public class Author {
    private int authorId;
    private String authorName;

    public Author() {
    }

    public Author(int authorId, String authorName) {

        this.authorId = authorId;
        this.authorName = authorName;
    }

    public int getAuthorId() {

        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (authorId != author.authorId) return false;
        return authorName != null ? authorName.equals(author.authorName) : author.authorName == null;
    }

    @Override
    public int hashCode() {
        int result = authorId;
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
