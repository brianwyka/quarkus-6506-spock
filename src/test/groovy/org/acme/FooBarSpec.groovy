package org.acme

import spock.lang.Specification

class FooBarSpec extends Specification {

    def "test foo bar"() {
        given:
        def foo = "Foo"

        when:
        def bar = "Bar"

        then:
        foo != bar
    }
}
