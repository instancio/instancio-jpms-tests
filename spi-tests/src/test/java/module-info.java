module org.instancio.tests.jpms.spi {
    requires org.instancio.core;
    requires org.instancio.junit;

    requires org.assertj.core;
    requires org.junit.jupiter.api;
    requires org.junit.jupiter.engine;

    provides org.instancio.spi.InstancioServiceProvider
            with org.instancio.tests.jpms.spi.InstancioServiceProviderImpl;

    opens org.instancio.tests.jpms.spi;
}