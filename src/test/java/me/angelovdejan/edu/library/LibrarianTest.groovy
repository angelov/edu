package me.angelovdejan.edu.library

import spock.lang.Specification

class LibrarianTest extends Specification {

    private Librarian librarian;

    void setup() {
        librarian = new Librarian();
    }

    def "librarians are employees"() {
        expect:
            librarian instanceof Employee;
    }

    def "librarians are members"() {
        expect:
            librarian instanceof Member;
    }
}
