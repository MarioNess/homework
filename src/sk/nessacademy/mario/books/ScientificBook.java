package sk.nessacademy.mario.books;

import sk.nessacademy.mario.books.Book;

public class ScientificBook extends Book {

    private String scientificArea;

    public ScientificBook(String bookName, String author, int pages, String scientificArea) {
        super(bookName, author, pages);
        this.scientificArea = scientificArea;
    }
}
