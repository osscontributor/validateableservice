package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(PeculiarService)
class PeculiarServiceSpec extends Specification {

    void "test validation"() {
        when: 'someString begins with a lower case letter'
        service.someString = 'invalid'

        then: 'validation fails'
        !service.validate()

        when: 'someString begins with an upper case letter'
        service.someString = 'Valid'

        then: 'validation passes'
        service.validate()
    }
}
