import spock.lang.Specification
import spock.lang.Unroll

import static Liveliness.ALIVE
import static Liveliness.DEAD
import static NeighbourCount.*

class GolSpec extends Specification {
    @Unroll
    def "#currentState cell with #count neighbours becomes #nextState"(currentState, count, nextState) {
        expect:
        currentState.next(count) == nextState

        where:
        currentState | count           || nextState
        ALIVE        | LESS_THAN_TWO   || DEAD
        ALIVE        | TWO             || ALIVE
        ALIVE        | THREE           || ALIVE
        ALIVE        | MORE_THAN_THREE || DEAD
        DEAD         | THREE           || ALIVE
        DEAD         | TWO             || DEAD
    }
}
