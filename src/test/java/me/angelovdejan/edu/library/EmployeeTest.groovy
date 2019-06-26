package me.angelovdejan.edu.library

import me.angelovdejan.edu.library.exceptions.MaximumNumberOfRentedBooksReached
import spock.lang.Specification

class EmployeeTest extends Specification {

    private Employee employee;

    void setup() {
        employee = new Employee();
    }

    def "employees are members"() {
        expect:
            employee instanceof Member;
    }

    def "employees can rent up to 5 books at same time"(){
        given:
            1.upto(5, {
                employee.rent(new Book());
            })

        when:
            employee.rent(new Book());

        then:
            thrown MaximumNumberOfRentedBooksReached;
    }
}
