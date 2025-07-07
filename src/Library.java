import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void displayAllBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
