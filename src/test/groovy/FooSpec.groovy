import spock.lang.Specification

class FooSpec extends Specification {

    def foo = new Foo()

    def "foo test"() {
        when:
        this.foo = new Foo()

        then:
        foo.bar() == 'bar'

    }
}
