package org.instancio.tests.jpms.standalone;

public class ClassWithoutAvailableConstructor {
    private String value;

    /**
     * Ensure a class can be instantiated bypassing constructors.
     */
    public ClassWithoutAvailableConstructor(final String value) {
        throw new AssertionError("Expected error from constructor");
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("ClassWithoutAvailableConstructor[value=%s]", value);
    }
}