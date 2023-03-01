module org.instancio.tests.jpms.jakarta {
    requires org.instancio.core;
    requires org.instancio.junit;

    requires jakarta.validation;
    requires org.hibernate.validator;

    requires org.assertj.core;
    requires org.junit.jupiter.api;
    requires org.junit.jupiter.engine;

    opens org.instancio.tests.jpms.hibernate;
}