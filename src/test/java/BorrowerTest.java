import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower customer1;
    Book book;
    Library library;

    @Before
    public void before(){
        customer1 = new Borrower("Danny");
        book = new Book(GenreType.COMEDY);
        library = new Library("Mitchell", 4);
    }

    @Test
    public void borrowersBooksAreEmptyToStart(){
        assertEquals(0, customer1.numberOfBooks());
    }

    @Test
    public void customerCanBorrowBook(){
        library.addBook(book);
        customer1.borrowBook(library, book);
        assertEquals(1, customer1.numberOfBooks());
        assertEquals(0, library.numberOfBooks());
    }


}
