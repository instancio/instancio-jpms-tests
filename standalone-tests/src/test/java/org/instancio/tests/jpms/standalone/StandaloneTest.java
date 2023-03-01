package org.instancio.tests.jpms.standalone;

import org.instancio.Instancio;
import org.instancio.junit.InstancioExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(InstancioExtension.class)
class StandaloneTest {

    @Test
    void create() {
        final ClassWithoutAvailableConstructor result = Instancio.create(ClassWithoutAvailableConstructor.class);

        assertThat(result).hasNoNullFieldsOrProperties();
    }
}
