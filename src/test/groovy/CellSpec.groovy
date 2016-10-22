import spock.lang.Specification

import static CellState.*

class CellSpec extends Specification {

    def "under-populated alive dies"() {
        given:
        def cell = new Cell(1, ALIVE)
        expect:
        cell.nextState == DEAD
    }

    def "cell with sufficient neighbours survive"() {
        given:
        def cell = new Cell(2, ALIVE)
        expect:
        cell.nextState == ALIVE
    }
}
