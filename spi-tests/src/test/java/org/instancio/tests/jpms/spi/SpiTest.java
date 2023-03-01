package org.instancio.tests.jpms.spi;

import org.instancio.Instancio;
import org.instancio.junit.InstancioExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(InstancioExtension.class)
class SpiTest {

    @Test
    void create() {
        final String result = Instancio.create(String.class);

        assertThat(result).isEqualTo("SPI-string");
    }
}
