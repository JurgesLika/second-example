package Excs;
public class Author {
    private String nameAuthor;
    private Book[] books;

    public Author(String nameAuthor){
        this.nameAuthor = nameAuthor;

    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public Book[] getBooks() {
        return books;
    }

    public double getAvgPageNumber(){
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getNrPges();
        }
        return (double)sum/ books.length;
    }

    public void printAvgPageNumber(){
        System.out.println(getAvgPageNumber());
    }
}
