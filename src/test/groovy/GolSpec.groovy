import spock.lang.Specification
import spock.lang.Unroll

import static Neighbours.*
import static State.ALIVE
import static State.DEAD

class GolSpec extends Specification {

    @Unroll
    def "#currentState cell with #neighbours neighbours becomes #nextState"(currentState, neighbours, nextState) {
        expect:
        Rule.foobar(currentState, neighbours) == nextState

        where:
        currentState | neighbours      || nextState
        ALIVE        | LESS_THAN_TWO   || DEAD
        ALIVE        | TWO             || ALIVE
        ALIVE        | THREE           || ALIVE
        ALIVE        | MORE_THAN_THREE || DEAD
        DEAD         | LESS_THAN_TWO   || DEAD
        DEAD         | TWO             || DEAD
        DEAD         | THREE           || ALIVE
        DEAD         | MORE_THAN_THREE || DEAD

    }
}
