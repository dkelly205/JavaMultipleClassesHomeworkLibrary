import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book(GenreType.COMEDY);
    }

    @Test
    public void canGetGenre(){
        assertEquals(GenreType.COMEDY, book.getGenre());
    }

    @Test
    public void comedyHasValueFunny(){
        assertEquals("Funny", book.getValueFromEnum());
    }

    @Test
    public void canGetAllGenres(){
        GenreType [] expected = {GenreType.COMEDY, GenreType.HORROR, GenreType.SCIFI, GenreType.THRILLER, GenreType.TRAVEL};
        GenreType [] genres = GenreType.values();
        assertEquals(5, genres.length);
        assertArrayEquals(expected, genres);

    }


}
