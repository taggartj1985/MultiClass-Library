import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(){
        this.capacity = 5;
        this.books = new ArrayList<Book>();
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

    public void removeBook(Book book){
        this.books.remove(this.books.indexOf(book));
    }
}
