package me.angelovdejan.edu.library;

import me.angelovdejan.edu.library.exceptions.MaximumNumberOfRentedBooksReached;

public class Employee extends AbstractMember {

    private static final int MAXIMUM_ALLOWED_BOOKS = 5;

    @Override
    public void rent(Book book) throws MaximumNumberOfRentedBooksReached {
        if (this.numberOfRentedBooks() == MAXIMUM_ALLOWED_BOOKS) {
            throw new MaximumNumberOfRentedBooksReached();
        }

        super.rent(book);
    }
}
