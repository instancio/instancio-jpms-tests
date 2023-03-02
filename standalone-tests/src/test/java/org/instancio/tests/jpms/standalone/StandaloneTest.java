package org.instancio.tests.jpms.standalone;

import org.instancio.Instancio;
import org.instancio.junit.InstancioExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(InstancioExtension.class)
class StandaloneTest {

    /**
     * Instantiate bypassing constructor to verify
     * {@code Unsafe.allocateInstance()} works as expected.
     */
    @Test
    void createClassWithoutAvailableConstructor() {
        final ClassWithoutAvailableConstructor result = Instancio.create(ClassWithoutAvailableConstructor.class);

        assertThat(result).hasNoNullFieldsOrProperties();
    }

    @Test
    void createPersonRecord() {
        final PersonRecord result = Instancio.create(PersonRecord.class);

        assertThat(result).hasNoNullFieldsOrProperties();
    }
}
