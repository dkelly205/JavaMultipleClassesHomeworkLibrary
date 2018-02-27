public class Book {

    private GenreType genre;

    public Book(GenreType genre){

        this.genre = genre;
    }

    public GenreType getGenre(){
        return this.genre;
    }

    public String getValueFromEnum(){
        return this.genre.getValue();
    }



}
