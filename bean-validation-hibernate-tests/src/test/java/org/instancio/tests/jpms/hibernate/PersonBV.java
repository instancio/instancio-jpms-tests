package org.instancio.tests.jpms.hibernate;

import jakarta.validation.constraints.Past;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;

public class PersonBV {

    @Length(min = 10, max = 10)
    private String name;

    @Range(min = 18, max = 99)
    private int age;

    @Past
    private LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}