public enum GenreType {

    COMEDY("Funny"),
    HORROR("Scary"),
    SCIFI("Futuristic"),
    THRILLER("Exciting"),
    TRAVEL("Tourism");

    private final String genre;


    GenreType(String genre){
        this.genre = genre;
    }

    public String getValue(){
        return this.genre;
    }
}


