import spock.lang.Specification

import static CellState.ALIVE
import static CellState.DEAD
import static Neighbours.*

class NextCellStateSpec extends Specification {

    def "dead without neigbours stays dead"(initialCellState, numberOfNeighbours, expectedCellState) {
        expect:
        expectedCellState == initialCellState.nextState(numberOfNeighbours)

        where:
        initialCellState | numberOfNeighbours | expectedCellState
        DEAD             | UNDER_POPULATED    | DEAD
        DEAD             | THREE              | ALIVE
        DEAD             | OVER_POPULATED     | DEAD
    }
}
