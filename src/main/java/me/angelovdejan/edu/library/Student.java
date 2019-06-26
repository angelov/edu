package me.angelovdejan.edu.library;

import me.angelovdejan.edu.library.exceptions.MaximumNumberOfRentedBooksReached;

public class Student extends AbstractMember {

    private static final int MAXIMUM_ALLOWED_BOOKS = 2;

    @Override
    public void rent(Book book) throws MaximumNumberOfRentedBooksReached {
        if (this.numberOfRentedBooks() == MAXIMUM_ALLOWED_BOOKS) {
            throw new MaximumNumberOfRentedBooksReached();
        }

        super.rent(book);
    }
}
