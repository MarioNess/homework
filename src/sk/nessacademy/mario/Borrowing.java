package sk.nessacademy.mario;

import sk.nessacademy.mario.books.Book;

import java.time.LocalDate;

public class Borrowing {
    private Book book;
    private Subscriber subscriber;
    private LocalDate borrowingDate;
    private LocalDate returnDate;

    public Borrowing(Book book, Subscriber subscriber, LocalDate borrowingDate) {
        this.book = book;
        this.subscriber = subscriber;
        this.borrowingDate = borrowingDate;
        this.returnDate = null;
    }

    public void setReturnDate( LocalDate returnDate){
        this.returnDate = returnDate;

    }


}
