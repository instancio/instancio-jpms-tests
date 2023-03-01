package org.instancio.tests.jpms.spi;

import org.instancio.Random;
import org.instancio.generator.Generator;
import org.instancio.spi.InstancioServiceProvider;

public class InstancioServiceProviderImpl implements InstancioServiceProvider {

    @Override
    public GeneratorProvider getGeneratorProvider() {
        return forClass -> {
            if (forClass == String.class) {
                return SpiStringGenerator.class;
            }
            return null;
        };
    }

    private static class SpiStringGenerator implements Generator<String> {
        @Override
        public String generate(final Random random) {
            return "SPI-string";
        }
    }
}
