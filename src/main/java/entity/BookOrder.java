package entity;

/**
 * Created by admin on 03.09.2018.
 */
public class BookOrder {
    private int id;
    private int userId;
    private int bookId;
    private int statusId;

    public BookOrder() {
    }

    public BookOrder(int id, int userId, int bookId, int statusId) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.statusId = statusId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookOrder bookOrder = (BookOrder) o;

        if (id != bookOrder.id) return false;
        if (userId != bookOrder.userId) return false;
        if (bookId != bookOrder.bookId) return false;
        return statusId == bookOrder.statusId;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + bookId;
        result = 31 * result + statusId;
        return result;
    }

    @Override
    public String toString() {
        return "BookOrderDAO{" +
                "id=" + id +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", statusId=" + statusId +
                '}';
    }
}
