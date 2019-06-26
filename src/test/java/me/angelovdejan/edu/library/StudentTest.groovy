package me.angelovdejan.edu.library

import me.angelovdejan.edu.library.exceptions.MaximumNumberOfRentedBooksReached
import spock.lang.Specification

class StudentTest extends Specification {

    private Student student;

    void setup() {
        student = new Student();
    }

    def "students are members"() {
        expect:
            this.student instanceof Member;
    }

    def "students can rent up to 2 books at same time"(){
        given:
            1.upto(2, {
                student.rent(new Book());
            });

        when:
            student.rent(new Book());

        then:
            thrown MaximumNumberOfRentedBooksReached;
    }
}
