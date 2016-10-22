import spock.lang.Specification
import spock.lang.Unroll

import static CellState.ALIVE
import static CellState.DEAD

class CellSpec extends Specification {

    @Unroll("#description")
    def "game of life rules"(currentState, aliveNeighbours, expectedState, description) {
        given:
        def cell = new Cell(aliveNeighbours, currentState)
        expect:
        cell.nextState == expectedState

        where:
        currentState | aliveNeighbours | expectedState | description
        ALIVE        | 9               | DEAD          | "under-populated alive dies"
        ALIVE        | 2               | ALIVE         | "cell with sufficient neighbours survive"


    }
}
