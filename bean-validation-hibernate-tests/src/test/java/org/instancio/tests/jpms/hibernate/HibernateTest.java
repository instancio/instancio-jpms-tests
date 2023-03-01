package org.instancio.tests.jpms.hibernate;

import org.instancio.Instancio;
import org.instancio.junit.InstancioExtension;
import org.instancio.junit.WithSettings;
import org.instancio.settings.Keys;
import org.instancio.settings.Settings;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(InstancioExtension.class)
class HibernateTest {

    @WithSettings
    private final Settings settings = Settings.create()
            .set(Keys.BEAN_VALIDATION_ENABLED, true);

    @Test
    void create() {
        final PersonBV result = Instancio.create(PersonBV.class);

        assertThat(result.getName()).hasSize(10);
        assertThat(result.getAge()).isBetween(18, 99);
        assertThat(result.getDateOfBirth()).isBefore(LocalDate.now());
    }
}
