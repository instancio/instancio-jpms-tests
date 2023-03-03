import org.instancio.tests.jpms.spi.impl.InstancioServiceProviderImpl;

module org.instancio.tests.jpms.spi.impl {
    requires org.instancio.core;

    provides org.instancio.spi.InstancioServiceProvider
            with InstancioServiceProviderImpl;
}