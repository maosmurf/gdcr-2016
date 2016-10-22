import spock.lang.Specification

import static CellState.*
import static Neighbours.*

class NextCellStateSpec extends Specification {

    def "dead without neigbours stays dead"(initialCellState, numberOfNeighbours, expectedCellState) {
        when:
        def nextState = initialCellState.nextState(numberOfNeighbours)

        then:
        nextState == expectedCellState;

        where:
        initialCellState | numberOfNeighbours | expectedCellState
        DEAD | UNDER_POPULATED  | DEAD
        DEAD | THREE            | ALIVE
        DEAD | OVERPOPULATED    | DEAD
    }
}
