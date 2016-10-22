import spock.lang.Specification

class NextCellStateSpec extends Specification {

    def "foo test"() {
        when:

        def nextState = CellState.DEAD.nextState(0)

        then:
        nextState == CellState.DEAD;
    }
}
