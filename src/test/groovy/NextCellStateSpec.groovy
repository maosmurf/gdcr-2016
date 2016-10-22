import spock.lang.Specification

class NextCellStateSpec extends Specification {

    def "foo test"() {
        when:
        def nextState = CellState.nextState(0)

        then:
        nextState == CellState.DEAD;
    }
}
