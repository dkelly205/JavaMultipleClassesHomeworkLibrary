import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> books;


    public Borrower(String name){
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public int numberOfBooks(){
        return this.books.size();
    }

//    public void borrowBook(Book book){
//        this.books.add(book);
//    }

    public void borrowBook(Library library, Book book){
        this.books.add(library.removeBook(book));
    }



}
