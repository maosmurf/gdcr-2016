import spock.lang.Specification

import static CellState.*

class CellSpec extends Specification {

    def "under-populated alive dies"() {
        given:
        def cell = new Cell(1, ALIVE)
        expect:
        cell.nextState == DEAD
    }


}
