import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genre;

    public Library(){
        this.capacity = 5;
        this.books = new ArrayList<Book>();
        this.genre = new HashMap<String, Integer>();

    }

    public int getCapacity(){
        return this.capacity;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        int currentCapacity = bookCount();
        if (currentCapacity < this.capacity){
            this.books.add(book);
        }
    }

    public Book removeBook(Book book){
        this.books.remove(book);
        return book;
    }

    public HashMap<String, Integer> getGenre() {
        return this.genre;
    }
}
