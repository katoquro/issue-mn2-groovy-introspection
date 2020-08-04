package com.example

import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class DemoSpec extends Specification {

    @Inject DemoControllerClient client

    void 'test it is broken'() {
        when:
        def mapStructure = [key: ['val'] as Set]

        client.doWithValidation(new IntrospectedDto(mapStructure: mapStructure))

        then:
        noExceptionThrown()
    }


    void 'test case without introspection'() {
        when:
        def mapStructure = [key: ['val'] as Set]

        client.doWithoutValidation(new NotIntrospectedDto(mapStructure: mapStructure))

        then:
        noExceptionThrown()
    }

    @Client('/demo')
    static interface DemoControllerClient extends DemoEndpoints {}
}