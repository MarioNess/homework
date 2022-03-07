package sk.nessacademy.mario.books;

public class ForeignBook extends Book{
    private String language = "English";


    public ForeignBook(String bookName, String author, int pages, String language) {
        super(bookName, author, pages);
        if (!language.isEmpty() || (language.replaceAll("[^a-zA-Z0-9]", "") == "")){
            this.language = language;
        }
    }

    public ForeignBook(String bookName, String author, int pages) {
        super(bookName, author, pages);
        this.language = language;

    }

}
