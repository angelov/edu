package me.angelovdejan.edu.library;

import me.angelovdejan.edu.library.exceptions.MaximumNumberOfRentedBooksReached;

public interface Member {

    MemberId id();

    void rent(Book book) throws MaximumNumberOfRentedBooksReached;

    void returnBack(Book book);

}
