package org.acme

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import spock.lang.Specification

@QuarkusTest
class ExampleResourceSpec extends Specification {

    def "test hello endpoint"() {
        given:
        def request = RestAssured.given()

        when:
        def response = request.get("/hello")

        then:
        response.statusCode == 200
        response.body.asString() == "hello"
    }
}
