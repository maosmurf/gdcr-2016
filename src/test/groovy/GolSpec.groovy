import spock.lang.Specification
import spock.lang.Unroll

import static Neighbours.*
import static State.ALIVE
import static State.DEAD

class GolSpec extends Specification {

    @Unroll
    def "#currentState cell with #neighbours neighbours becomes #nextState"(currentState, neighbours, nextState) {
        expect:
        Rules.getNextState(currentState, neighbours) == nextState

        where:
        currentState | neighbours      || nextState
        ALIVE        | ONE             || DEAD
        ALIVE        | MORE_THAN_THREE || DEAD
        DEAD         | TWO           || DEAD
        DEAD         | THREE           || ALIVE

    }
}
