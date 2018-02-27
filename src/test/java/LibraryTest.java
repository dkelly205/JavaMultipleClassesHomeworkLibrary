import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Mitchell", 5);
        book = new Book(GenreType.HORROR);
    }

    @Test
    public void numberOfBooksStartsEmpty(){
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void addBook(){
        library.addBook(book);
        assertEquals(1, library.numberOfBooks());
        library.addBook(book);
        assertEquals(2, library.numberOfBooks());
    }

    @Test
    public void stockFullSoCantAddBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.numberOfBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.removeBook(book);
        assertEquals(2, library.numberOfBooks());



    }
}
