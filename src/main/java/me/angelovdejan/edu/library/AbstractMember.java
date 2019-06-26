package me.angelovdejan.edu.library;

import me.angelovdejan.edu.library.exceptions.MaximumNumberOfRentedBooksReached;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractMember implements Member {
    protected Set<Book> rentedBooks = new HashSet<>();

    @Override
    public MemberId id() {
        // @todo
        return null;
    }

    @Override
    public void rent(Book book) throws MaximumNumberOfRentedBooksReached {
        rentedBooks.add(book);
    }

    protected int numberOfRentedBooks() {
        return this.rentedBooks.size();
    }

    @Override
    public void returnBack(Book book) {
        rentedBooks.remove(book);
    }
}
