import spock.lang.Specification

import static CellState.DEAD
import static Neighbours.UNDER_POPULATED

class NextCellStateSpec extends Specification {

    def "dead without neigbours stays dead"() {
        when:
        def nextState = DEAD.nextState(UNDER_POPULATED)
        then:
        nextState == DEAD;
    }

    def "dead with three neighbours becomes alive"() {
        when:
        def nextState = DEAD.nextState(THREE)
        then:
        nextState == ALIVE;
    }
}
