import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int numberOfBooks(){
        return books.size();
    }

    public void addBook(Book book){
        if(numberOfBooks() < capacity) {
            books.add(book);
        }
    }

    public Book removeBook(Book book){
        this.books.remove(book);
        return book;
    }
}
