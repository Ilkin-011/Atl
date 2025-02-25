package Camperator;

public class Book {
    private String bookName;
    private Integer bookPage;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookPage() {
        return bookPage;
    }

    public void setBookPage(Integer bookPage) {
        this.bookPage = bookPage;
    }

    public Book(String bookName, Integer bookPage) {
        this.bookName = bookName;
        this.bookPage = bookPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPage=" + bookPage +
                '}';
    }

//    @Override
//    public int compareTo(Book o) {
//        return bookPage.compareTo(bookPage);
//    }
}
