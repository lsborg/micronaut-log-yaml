package com.example

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import spock.lang.Specification
import jakarta.inject.Inject

@MicronautTest
class LogYamlSpec extends Specification {

    @Inject
    EmbeddedApplication<?> application

    @Inject
    static final Logger logger = LoggerFactory.getLogger(LogYamlSpec.class)

    void 'test it works'() {
        logger.debug('log yaml spec')

        expect:
        application.running
    }

}
