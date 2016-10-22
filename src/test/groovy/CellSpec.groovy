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
        ALIVE        | 1               | DEAD          | "under-populated alive dies"
        ALIVE        | 2               | ALIVE         | "cell with sufficient neighbours survive"
        ALIVE        | 3               | ALIVE         | "cell with sufficient neighbours survive"
        ALIVE        | 4               | DEAD          | "over-populated alive dies"
        ALIVE        | 5               | DEAD          | "over-populated alive dies"
        ALIVE        | 6               | DEAD          | "over-populated alive dies"
        ALIVE        | 7               | DEAD          | "over-populated alive dies"
        ALIVE        | 8               | DEAD          | "over-populated alive dies"
        ALIVE        | 9               | DEAD          | "over-populated alive dies"
        DEAD         | 1               | DEAD          | "dead with few neighbours stays dead"
        DEAD         | 2               | DEAD          | "dead with few neighbours stays dead"
        DEAD         | 3               | ALIVE         | "dead reproduces"
        DEAD         | 4               | DEAD          | "dead with many neighbours stays dead"
        DEAD         | 5               | DEAD          | "dead with many neighbours stays dead"


    }
}
