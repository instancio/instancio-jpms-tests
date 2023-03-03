package org.instancio.tests.jpms.spi.impl;

import org.instancio.Random;
import org.instancio.generator.Generator;
import org.instancio.spi.InstancioServiceProvider;

public class InstancioServiceProviderImpl implements InstancioServiceProvider {

    @Override
    public GeneratorProvider getGeneratorProvider() {
        return (node, gen) -> {
            if (node.getTargetClass() == String.class) {
                return new SpiStringGenerator();
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
