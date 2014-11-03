package demo

@grails.validation.Validateable
class PeculiarService {

    String someString

    static constraints = {
        someString matches: /[A-Z].*/
    }
}
