package org.instancio.tests.jpms.jakarta;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class PersonBV {

    @Size(min = 10, max = 10)
    private String name;

    @Min(18)
    @Max(99)
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